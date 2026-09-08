class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    char c=board[i][j];
                    board[i][j]='.';
                    if(!safe(i,j,board,c)) return false;
                }
            }
        }
        return true;
        
    }
    public boolean safe(int r,int c,char[][] board,char ch){
        for(int i=0;i<9;i++){
            if(board[r][i]==ch) return false;
            if(board[i][c]==ch) return false;
        }
        int sr=(r/3)*3;
        int sc=(c/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==ch) return false;
            }
        }
        return true;
    }
}