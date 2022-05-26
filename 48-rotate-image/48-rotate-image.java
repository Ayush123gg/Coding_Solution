class Solution {
    public void rotate(int[][] matrix) {
        //Transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int[] a:matrix){
            System.out.println(Arrays.toString(a));
        }
        for(int i=0;i<matrix.length;i++){
            int l=0,h=matrix[0].length-1;
            while(l<=h){
                int temp=matrix[i][l];
                matrix[i][l]=matrix[i][h];
                matrix[i][h]=temp;
                l++;
                h--;
            }
        }
    }
}