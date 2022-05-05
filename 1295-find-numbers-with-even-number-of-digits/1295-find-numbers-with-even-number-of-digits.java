class Solution {
    public int findNumbers(int[] nums) {
        /*int count=0;
        for(int i=0;i<nums.length;i++){
            //int r=0;
            int n=nums[i];
            int c=0;
            /*while(n>0){
                c++;
                n=n/10;
            
            if(c%2==0)count++;
           
                
        }*/
        int c=0;
        for(int a:nums){
            if(even(a)) c++;
        }
        return c;
    }
    public boolean even(int a){
        return digit(a)%2==0;
    }
    public int digit(int a){
        int r=0;
        while(a>0){
            r++;
            a=a/10;
        }
        return r;
    }
}