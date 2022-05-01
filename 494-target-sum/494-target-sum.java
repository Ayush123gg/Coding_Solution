class Solution {
    int rec(int n,int s,int[] nums,int tar){
        if(n==nums.length){
            if(s==tar){
                return 1;
            }
            return 0;
        }
        int l=rec(n+1,s+nums[n],nums,tar);
        int r=rec(n+1,s-nums[n],nums,tar);
        return l+r;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return rec(0,0,nums,target);
    }
}