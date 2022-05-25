class Solution {
    public boolean canArrange(int[] arr, int k) {
        int cnt[]=new int[k+1];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]%k<0){
                cnt[arr[i]%k+k]++;
            }else{
                cnt[arr[i]%k]++;
            }
        }
        if(cnt[0]%2!=0) return false;
        if(k%2==0 && cnt[k/2]%2!=0) return false;
        for(int i=1;i<=k/2&&(i!=k-i);i++){
            if(cnt[i]!=cnt[k-i]) return false;
        }
        return true;
    }
}