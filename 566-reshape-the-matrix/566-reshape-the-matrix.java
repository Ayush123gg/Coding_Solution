class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length,m=mat[0].length;
        if(r*c==m*n){
            int temp[][]=new int[r][c];
            for(int i=0;i<(m*n);i++){
                temp[i/c][i%c]=mat[i/m][i%m];
            }
            return temp;
        }
        return mat;
    }
}