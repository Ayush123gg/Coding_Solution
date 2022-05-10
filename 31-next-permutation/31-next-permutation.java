class Solution {
    public void nextPermutation(int[] nums) {
        int indx1=nums.length-2;
        while(indx1>=0&&nums[indx1]>=nums[indx1+1]) {
            indx1--;
        }
        if(indx1>=0){
            int indx2=nums.length-1;
            while(indx2>indx1&&nums[indx2]<=nums[indx1]) indx2--;
            nums[indx1]=nums[indx1]+nums[indx2];
            nums[indx2]=nums[indx1]-nums[indx2];
            nums[indx1]=nums[indx1]-nums[indx2];
        }
        reverse(nums,indx1+1);
    }
    void reverse(int[] nums,int i){
        int s=i;
        int e=nums.length-1;
        while(s<e){
            nums[s]=nums[s]+nums[e];
            nums[e]=nums[s]-nums[e];
            nums[s]=nums[s]-nums[e];
            s++;e--;
        }
    }
}