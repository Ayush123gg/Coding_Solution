class Solution {
    int binary(int num[],int i,int j,int key){
        int indx=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(num[mid]<=key){
                j=mid-1;
            }else{
                if(mid<j&&num[mid]==num[mid+1]) i=mid+1;
                else if(mid<j&&num[mid]>=num[mid+1]&&num[mid+1]>key) i=mid+1;
                else{
                    return mid;
                }
            }
        }
        return indx;
    }
    public void nextPermutation(int[] nums) {
        int indx1=nums.length-2;
        while(indx1>=0&&nums[indx1]>=nums[indx1+1]) {
            indx1--;
        }
        if(indx1>=0){
            int indx2=nums.length-1;
            /*while(indx2>indx1&&nums[indx2]<=nums[indx1]) indx2--;*/
            indx2=binary(nums,indx1+1,indx2,nums[indx1]);
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