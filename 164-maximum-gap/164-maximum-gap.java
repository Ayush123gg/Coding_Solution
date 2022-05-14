class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2) return 0;
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int num:nums){
            max=Math.max(num,max);
            min=Math.min(num,min);
        }
        int interval=(int)Math.ceil((max-min+0.0)/(nums.length-1));
        int maxBuck[]=new int[nums.length-1];
        int minBuck[]=new int[nums.length-1];
        Arrays.fill(maxBuck,Integer.MIN_VALUE);
        Arrays.fill(minBuck,Integer.MAX_VALUE);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==min||nums[i]==max) continue;
            int place=(nums[i]-min)/(interval);
            maxBuck[place]=Math.max(nums[i],maxBuck[place]);
            minBuck[place]=Math.min(nums[i],minBuck[place]);
        }
        int prv=min;
        int gap=0;
        for(int i=0;i<nums.length-1;i++){
            if(maxBuck[i]==Integer.MIN_VALUE) continue;
            gap=Math.max(gap,minBuck[i]-prv);
            prv=maxBuck[i];
        }
        gap=Math.max(gap,max-prv);
        return gap;
    }
}