class Solution {
    // it takes quadratic times
    int dp(int arr[][],int i,int j,int a[][]){
        if(i>=arr.length||j>=arr[0].length){
            return 0;
        }
        if(i==arr.length-1&&j==arr[0].length-1) return 1;
        if(a[i][j]!=-1) return a[i][j];
        int l=dp(arr,i+1,j,a);
        int r=dp(arr,i,j+1,a);
        return a[i][j]=l+r;
    }
    // Combination method 
    int Combination(int m,int n){
        int total=m+n-2;
        double res=1;
        int r=m-1;
        for(int i=1;i<=r;i++){
            res=res*(total-r+i)/i;
        }
        return (int)res;
    }
    public int uniquePaths(int m, int n) {
        /*int arr[][]=new int[m][n];
        int a[][]=new int[m+1][n+1];
        for(int[] aa:a)
            Arrays.fill(aa,-1);*/
        
        return Combination(m,n);
    }
}