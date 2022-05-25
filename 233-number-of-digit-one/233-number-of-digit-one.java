class Solution {
    public int countDigitOne(int n) {
        String s=Integer.toString(n);
        
        int l=s.length();
        System.out.println(s);
        int res=0;
        for(int i=0;i<l;i++){
            if((int)s.charAt(i)==(int)'0'){ continue;}
            if((int)s.charAt(i)>(int)'1'){
                int cur_dig=(int)Math.pow(10,l-i-1);
                System.out.println(cur_dig);
                int low_dig=(l-i-1)*(int)(cur_dig/10);
                System.out.println(low_dig);
                low_dig=(s.charAt(i)-'0')*(low_dig);
                System.out.println(low_dig);
                int total=cur_dig+low_dig;
                System.out.println(total);
                res+=total;
            }else{
                if(i==l-1) res+=1;
                else {
                int cur_dig=Integer.parseInt(s.substring(i+1));
                cur_dig=cur_dig+1;
                int low_dig=(l-i-1)*((int)Math.pow(10,l-i-1)/10);
                int total=cur_dig+low_dig;
                res+=total;
                }
            }
            //Sysetm.out.println(total);
        }
        return res;
    }
}