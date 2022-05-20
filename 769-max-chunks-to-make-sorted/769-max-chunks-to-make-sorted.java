class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max=Integer.MIN_VALUE;
        int c=0;
        int rmin[]=new int[arr.length+1];
        rmin[arr.length]=Integer.MAX_VALUE;
        rmin[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rmin[i]=Math.min(arr[i],rmin[i+1]);
        }
       // System.out.println(Arrays.toString(rmin));
        for(int i=0;i<arr.length;i++){
           max=Math.max(max,arr[i]);
            if(max<=rmin[i+1]) c++;
        }
        return c;
    }
}