class NumArray {
    int arr[]=null;
    public NumArray(int[] nums) {
        arr=new int[nums.length+1];
        //System.arraycopy(nums, 0, arr, 1, nums.length+1);
        arr[1]=nums[0];
        for(int i=2;i<arr.length;i++) arr[i]=arr[i-1]+nums[i-1];
    }
    
    public int sumRange(int left, int right) {
        return arr[right+1]-arr[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */