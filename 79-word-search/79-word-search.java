class Solution {
    boolean rec(String s,char[][] board,int i,int j,int n){
        if(n==s.length()){
            return true;
        }
        if(i>=board.length||j>=board[0].length||i<0||j<0||board[i][j]!=s.charAt(n)) return false;
        char temp=board[i][j];
        board[i][j]=' ';
        boolean l=rec(s,board,i+1,j,n+1)||rec(s,board,i,j+1,n+1)||rec(s,board,i-1,j,n+1)||rec(s,board,i,j-1,n+1);
        board[i][j]=temp;
        return l;
    }
    public boolean exist(char[][] board, String word) {
        //return rec(s,board,"",0,0,0);
        int n=board.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)&&rec(word,board,i,j,0)) return true;
            }
        }
        return false;
    }
}