class Solution {
    boolean bSearchIN2D(int[][] arr,int tar,int col){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid][col]==tar) return true;
            else if(arr[mid][col]>tar) j = mid-1;
            else i=mid+1;
        }
        return false;
    }
    int binSearch(int[][] arr,int row,int tar){
        int i=0;
        int j=arr[0].length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[row][mid]==tar) return mid;
            else if(arr[row][mid]>tar) j = mid-1;
            else i=mid+1;
        }
        return j;
    }
    boolean bSearch(int[][] arr,int row,int col,int tar){
        while(row<arr.length&&col>=0){
            if(arr[row][col]==tar) return true;
            if(arr[row][col]>tar) col--;
            else row++;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        /*int col=binSearch(matrix,0,target);
        if(col==-1) return false;
        else{
            return bSearchIN2D(matrix,target,col);
        }*/
        return bSearch(matrix,0,matrix[0].length-1,target);
    }
}