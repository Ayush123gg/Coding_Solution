class NumMatrix {
    int mat[][]=null;
    public NumMatrix(int[][] matrix) {
        this.mat=matrix;
        for(int i=0;i<mat.length;i++){
            for(int j=1;j<mat[0].length;j++){
                mat[i][j]=mat[i][j-1]+mat[i][j];
            }
        }
        for(int i=0;i<mat[0].length;i++){
            for(int j=1;j<mat.length;j++){
                mat[j][i]=mat[j-1][i]+mat[j][i];
            }
        }
    }
    
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(row1>0&&col1>0){
            return mat[row2][col2]-mat[row1-1][col2]-mat[row2][col1-1]+mat[row1-1][col1-1];
        }
        else if(row1>0) return mat[row2][col2]-mat[row1-1][col2];
        else if(col1>0) return mat[row2][col2]-mat[row2][col1-1];
        else return mat[row2][col2];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */