class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max=Integer.MIN_VALUE;
        int c=0;
        int rmin[]=new int[arr.length+1];
        rmin[arr.length]=Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            rmin[i]=Math.min(rmin[i+1],arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
            if(rmin[i+1]>=max){
                c++;
            }
        }
        return c;
    }
}