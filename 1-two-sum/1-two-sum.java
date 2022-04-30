class Solution {
    public int[] twoSum(int[] nums, int t) {
     
      /* for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
            if(nums[i]+nums[j]==target){
                return new int[] {i,j};
            }
                }
        }
        }

        return new int[] {-1,-1};*/
       /* Arrays.sort(nums);
        int s=0;
        int n=nums.length;
        int l=n-1;
        while(s<l){
            if(nums[s]+nums[l]<t){
                s++;
            }else if(nums[s]+nums[l]>t){
                l--;
            }else if(nums[s]+nums[l]==t){
                break;
            }
        }
        int arr[]={s,l};
        return arr;*/
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(t-nums[i])){
                hm.put(nums[i],i);
            }else {
                int nn=hm.get(t-nums[i]);
                return new int[] {nn,i};
            }
        }
        return new int[]{-1,-1};
    }
}