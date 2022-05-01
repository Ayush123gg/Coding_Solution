class Solution {
    public int kthGrammar(int n, int k) {
        //iterative
        /*String s[]=new String[n];
        s[0]="0";
        for(int i=1;i<n;i++){
            s[i]=fun(s[i-1]);
            //System.out.println(s[i]);
        }
        
        return s[n-1].charAt(k-1)-'0';*/
        if(n==1&&k==1) return 0;
        int mid=(int)Math.pow((double)2,(double)(n-1))/2;
        if(k<=mid) return kthGrammar(n-1,k);
        else return kthGrammar(n-1,k-mid)==1?0:1;
    }
    public String fun(String str){
        StringBuilder ss=new StringBuilder();
        for(char c:str.toCharArray()){
            if(c=='1') ss.append("10");
            else ss.append("01");
        }
        return ss.toString();
    }
}