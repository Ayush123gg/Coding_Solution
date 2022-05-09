class Solution {
    public int maxAbsValExpr(int[] arr, int[] arr2) {
        int c1max=Integer.MIN_VALUE,c1min=Integer.MAX_VALUE,c2max=Integer.MIN_VALUE,c2min=Integer.MAX_VALUE,c3max=Integer.MIN_VALUE,c3min=Integer.MAX_VALUE,c4max=Integer.MIN_VALUE,c4min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(c1max<(arr[i]+i+arr2[i])) c1max=(arr[i]+i+arr2[i]);
            if(c1min>(arr[i]+i+arr2[i])) c1min=(arr[i]+i+arr2[i]);
            if(c2max<(i-arr[i]-arr2[i])) c2max=(i-arr[i]-arr2[i]);
            if(c2min>(i-arr[i]-arr2[i])) c2min=(i-arr[i]-arr2[i]);
            if(c3max<(arr[i]+i-arr2[i])) c3max=(arr[i]+i-arr2[i]);
            if(c3min>(arr[i]+i-arr2[i])) c3min=(arr[i]+i-arr2[i]);
            if(c4max<(i-arr[i]+arr2[i])) c4max=(i-arr[i]+arr2[i]);
            if(c4min>(i-arr[i]+arr2[i])) c4min=(i-arr[i]+arr2[i]);
        }
        return Math.max(Math.max(c1max-c1min,c2max-c2min),Math.max(c3max-c3min,c4max-c4min));
       
    }
}