class Solution {
    public int countNegatives(int[][] grid) {
        int i=0,j=grid[0].length-1;
        int c=0;
        while(i<grid.length&&j>=0){
            if(grid[i][j]<0){
                c+=(grid.length-i);
                j--;
            }else if(grid[i][j]>=0) i++;
        }
        return c;
    }
}