class Solution {
    public int maximumGap(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        if(nums.length<2) return 0;
        for(int num:nums){
            if(min>num) min=num;
            if(max<num) max=num;
        }
        int interval=(int)Math.ceil((max-min+0.0)/(nums.length-1));
        int minbuckt[]=new int[nums.length-1];
        int maxbuckt[]=new int[nums.length-1];
        Arrays.fill(minbuckt,Integer.MAX_VALUE);
        Arrays.fill(maxbuckt,Integer.MIN_VALUE);
        for(int num:nums){
            if(num==min||num==max) continue;
            int idx=(num-min)/(interval);
            minbuckt[idx]=Math.min(minbuckt[idx],num);
            maxbuckt[idx]=Math.max(maxbuckt[idx],num);
        }
        int gap=0;
        int prv=min;
        for(int i=0;i<maxbuckt.length;i++){
            if(maxbuckt[i]==Integer.MIN_VALUE||minbuckt[i]==Integer.MAX_VALUE) continue;
            gap=Math.max(gap,minbuckt[i]-prv);
            prv=maxbuckt[i];
        }
        gap=Math.max(gap,max-prv);
        return gap;
    }
}