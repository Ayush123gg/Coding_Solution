class Solution {
    int maxSum(int[] arr,int k){
        int sum1=0,sum2=0;
        for(int i=0;i<=k;i++){
            sum1+=arr[i];
           // else sum2+=arr[i];
        }
        return sum1;
    }
    public int splitArray(int[] nums, int m) {
        
        //trying bruit force approach
        /*int max=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int sum=0;
            for(int j=0;j<m;j++) {
                int s=maxSum(nums,i+j);
                if(sum<s) sum=s;
            }
            if(sum<max) max=sum;
        }
        return max;*/
        
        
        //Here we use Binary search
        int s=Integer.MIN_VALUE;
        int e=0;
        for(int num:nums){
            s=Math.max(num,s);//Minimum value of ans
            e+=num;//maximum value of ans
        }
        while(s<e){//when s==e loop will break
            int mid=s+(e-s)/2;//try for mid as potential ans
            int sum=0;
            int p=1;
            for(int num:nums){
                if(sum+num>mid){
                    //cann't add this
                    sum=num;
                    p++;
                }else{
                    sum+=num;
                }
            }
            if(p>m){
                s=mid+1;
            }else{
                e=mid;
            }
        }
        return s;
    }
}