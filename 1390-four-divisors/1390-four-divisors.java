class Solution {
    int calDivisors(int a){
        int sum=0,c=0;
        for(int i=1;i<=Math.sqrt(a);i++){
            if(a%i==0){
                sum+=(i);
                if(a/i!=i){
                sum+=(a/i);
                c+=2;
                }else{
                c++;
                }
            }
        }
        return c==4?sum:0;
    }
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=calDivisors(nums[i]);
        }
        return sum;
    }
}