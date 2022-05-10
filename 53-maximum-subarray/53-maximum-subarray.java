class Solution {
    public int maxSubArray(int[] nums) {
        int prsum=Integer.MIN_VALUE,cursum=0;
        for(int i=0;i<nums.length;i++){
            cursum+=nums[i];
            prsum=Math.max(prsum,cursum);
            if(cursum<0) cursum=0;
        }
        return prsum;
    }
}