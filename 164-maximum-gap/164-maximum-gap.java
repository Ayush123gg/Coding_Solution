class Solution {
    public int maximumGap(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        if(nums.length<2) return 0;
        for(int num:nums){//finding min max
            if(min>num) min=num;
            if(max<num) max=num;
        }
        int interval=(int)Math.ceil((max-min+0.0)/(nums.length-1));// calculating interval
        int minbuckt[]=new int[nums.length-1];// creatin no. of bucket size array for storing only min value of particular index bucket
        int maxbuckt[]=new int[nums.length-1];// creatin no. of bucket size array for storing only max value of particular index bucket
        Arrays.fill(minbuckt,Integer.MAX_VALUE);
        Arrays.fill(maxbuckt,Integer.MIN_VALUE);
        for(int num:nums){
            if(num==min||num==max) continue;// we take min and max as seperate
            int idx=(num-min)/(interval);
            minbuckt[idx]=Math.min(minbuckt[idx],num);// storing min max 
            maxbuckt[idx]=Math.max(maxbuckt[idx],num);
        }
        int gap=0;
        int prv=min;
        for(int i=0;i<maxbuckt.length;i++){
            if(maxbuckt[i]==Integer.MIN_VALUE||minbuckt[i]==Integer.MAX_VALUE) continue;//bucket[i] doesn't contains element 
            gap=Math.max(gap,minbuckt[i]-prv);// finding max gap
            prv=maxbuckt[i];
        }
        gap=Math.max(gap,max-prv);// for max element
        //TC :- O(n+n+n+n+n)--> O(n)
        return gap;
    }
}