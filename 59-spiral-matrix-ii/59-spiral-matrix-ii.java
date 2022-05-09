class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
        int rs=0,re=n-1,cs=0,ce=n-1;
        int j=1;
        while(rs<=re&&cs<=ce){
            for(int i=cs;i<=ce;i++){
                arr[rs][i]=j++;
            }
            rs++;
            for(int i=rs;i<=re;i++){
                arr[i][ce]=j++;
            }
            ce--;
            for(int i=ce;i>=cs;i--){
                arr[re][i]=j++;
            }
            re--;
            for(int i=re;i>=rs;i--){
                arr[i][cs]=j++;
            }
            cs++;
        }
        return arr;
    }
}