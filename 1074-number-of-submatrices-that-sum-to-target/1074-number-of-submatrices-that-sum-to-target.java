class Solution {
    static int preSumMaxSum(int[][] arr,int tar){
        int maxSum=Integer.MIN_VALUE;
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                arr[i][j]=arr[i][j-1]+arr[i][j];
            }
        }
        /* for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }*/
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                arr[j][i]=arr[j-1][i]+arr[j][i];
            }
        }
        int c=0;
        for(int top=0;top<n;top++){
            for(int left=0;left<m;left++){
                for(int botom=top;botom<n;botom++){
                    for(int right=left;right<m;right++){
                        int sum=0;
                        // Using prefix Sum--O(1)
                        if(top>0&&left>0){
                        sum=arr[botom][right]-arr[top-1][right]-arr[botom][left-1]+arr[top-1][left-1];}
                        else if(top>0){
                            sum=arr[botom][right]-arr[top-1][right];
                        }else if(left>0){
                            sum=arr[botom][right]-arr[botom][left-1];
                        }else {
                            sum =arr[botom][right];
                        }
                        if(sum==tar) c++;
                    }
                }
            }
        }
        return c;
    }
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        return preSumMaxSum(matrix,target);
    }
}