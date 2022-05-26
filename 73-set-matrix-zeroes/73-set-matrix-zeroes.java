class Solution {
    public void setZeroes(int[][] arr) {
        int col=0;
        int row=0;
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<m;i++){
            if(arr[0][i]==0) col=1;
        }
        for(int i=0;i<n;i++){
            if(arr[i][0]==0) row=1;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j]==0){
                    arr[0][j]=0;
                    arr[i][0]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
           if(arr[i][0]==0){
               for(int j=1;j<m;j++){
                   arr[i][j]=0;
               }
           }
        }
        for(int i=1;i<m;i++){
           if(arr[0][i]==0){
               for(int j=1;j<n;j++){
                   arr[j][i]=0;
               }
           }
        }
        if(row==1){
            for(int i=0;i<n;i++){
                arr[i][0]=0;
        }
        }
        if(col==1){
            for(int i=0;i<m;i++){
                arr[0][i]=0;
        }
        }
    }
}