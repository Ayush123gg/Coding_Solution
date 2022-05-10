class Solution {
    public void fun(int[][] arr,int i,int j,boolean b[][]){
        for(int r=0;r<arr.length;r++){
            if(arr[r][j]!=0) {arr[r][j]=0;b[r][j]=true;}
        }
        for(int c=0;c<arr[0].length;c++){
            if(arr[i][c]!=0) {arr[i][c]=0;b[i][c]=true;}
        }
    }
    public void setZeroes(int[][] matrix) {
        boolean b[][]=new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0&&b[i][j]!=true){
                    fun(matrix,i,j,b);
                    b[i][j]=true;
                }
            }
        }
    }
}