class Solution {
    
public:
    int floorr(vector<int>& arr,int target){
    int n=arr.size();
    //int n=sizeof(*arr)/sizeof(arr[0]);
    int start=0;
    int end=n-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]==target) {
            if(mid>0&&(arr[mid-1])==target) end=mid-1;
            else
                return mid;
        }
        else if(arr[mid]>target) end=mid-1;
        else start=mid+1;
    }
    return -1;
}
int ceiling(vector<int>& arr,int target){
    //cout<<n<<endl;
    int n=arr.size();
    int start=0;
    int end=n-1;
    while(start<=end){
        int mid=start+(end-start)/2;
         if(arr[mid]==target) {
            if(mid<(n-1)&&(arr[mid+1])==target) start=mid+1;
            else
                return mid;
        }
        else if(arr[mid]>target) end=mid-1;
        else start=mid+1;
    }
    return -1;
}
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> g1;
        g1.push_back(floorr(nums,target));
        g1.push_back(ceiling(nums,target));
        return g1;
    }
};