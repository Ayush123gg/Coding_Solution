class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        if(nums.size()<=1) return;
        int i=nums.size()-2;
        while(i>=0&&nums[i]>=nums[i+1]) i--;
        int j=nums.size()-1;
        while(i>=0&&j>i&&nums[i]>=nums[j]) j--;
        if(i>=0){
            swap(nums[i],nums[j]);
        }
        reverse(nums.begin()+i+1,nums.end());
    }
};