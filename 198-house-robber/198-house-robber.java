class Solution {
    int recdp(int[] nums,int n,int[] dp){
		if(n==0){
			return nums[n];
		}
		if(n<0) return 0;
		if(dp[n]!=-1) return dp[n];
		int l=nums[n]+recdp(nums,n-2,dp);
		int f=0+recdp(nums,n-1,dp);
		return dp[n]=Math.max(f,l);
	}
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return recdp(nums,nums.length-1,dp);
    }
}