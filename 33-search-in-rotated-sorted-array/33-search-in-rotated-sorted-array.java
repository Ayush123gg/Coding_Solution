class Solution {
    int searchFpiv(int[] arr){
        int n=arr.length;
        int s=0,e=n-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m<e&&arr[m]>arr[m+1]) return m;
            if(m>0&&arr[m]<arr[m-1]) return m-1;
            if(arr[s]>=arr[m]) e=m-1;
            else s=m+1;
        }
        return -1;
    }
    int Bsearch(int[] arr,int tar,int s,int e){
        int n=arr.length;
        //int s=0,e=n-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==tar) return m;
            if(arr[m]>tar) e=m-1;
            else s=m+1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int k=searchFpiv(nums);
        if(k==-1){
            return Bsearch(nums,target,0,nums.length-1);
        }
        //else{
            //return Math.max(Bsearch(nums,target,0,k),Bsearch(nums,target,k+1,nums.length-1));
        //} 
        if(nums[k]==target) return k;
        if(nums[0]<=target) return Bsearch(nums,target,0,k-1);
        return Bsearch(nums,target,k+1,nums.length-1);
    }
}