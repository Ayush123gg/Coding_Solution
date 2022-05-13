class Solution {
    public int maxProfit(int[] arr) {
        int mini=arr[0];
        int pro=0;;
        for(int i=1;i<arr.length;i++){
            int c=arr[i]-mini;
            if(c>=0){
                pro+=c;mini=arr[i];
            }
            else mini=Math.min(mini,arr[i]);
        }
        return pro;
    }
}