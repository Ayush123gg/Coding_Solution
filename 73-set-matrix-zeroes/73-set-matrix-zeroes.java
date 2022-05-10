class Solution {
    public void fun(int[][] arr,int i,int j,boolean b[][]){
        for(int r=0;r<arr.length;r++){
            if(arr[r][j]!=0) {arr[r][j]=0;b[r][j]=true;}
        }
        for(int c=0;c<arr[0].length;c++){
            if(arr[i][c]!=0) {arr[i][c]=0;b[i][c]=true;}
        }
    }
    public void setZeroes(int[][] matrix) {//it will take O(n^2) space
       /* boolean b[][]=new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0&&b[i][j]!=true){
                    fun(matrix,i,j,b);
                    b[i][j]=true;
                }
            }
        }*/
        // best approach
        int col=matrix[0].length,row=matrix.length;
        boolean col0=true;
        for(int i=0;i<row;i++){
            if(matrix[i][0]==0) col0=false;
            for(int j=1;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=1;j--){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
            if(col0==false) matrix[i][0]=0;
        }
    }
}