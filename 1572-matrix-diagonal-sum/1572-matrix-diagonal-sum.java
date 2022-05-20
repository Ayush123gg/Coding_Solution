class Solution {
    public int diagonalSum(int[][] mat) {
        int i=0,j=0;
        int sum=0;
        int n=mat.length,m=mat[0].length;
        while(i<mat.length&&j<mat[0].length){
            if(i==n-i-1)
                sum+=mat[i][j];
            else sum+=mat[i][j]+mat[n-i-1][j];
            i++;j++;
        }
        return sum;
    }
}