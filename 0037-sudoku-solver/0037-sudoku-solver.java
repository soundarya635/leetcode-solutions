class Solution {
    public void solveSudoku(char[][] board) {
        back(0,0,board);
    }
    public boolean back(int r,int c,char[][] board){
        if(r==9) return true;
        int nextr=r;
        int nextc=c+1;
        if(nextc==9){
            nextr=r+1;
            nextc=0;
        }
        if(board[r][c]!='.') return back(nextr,nextc,board);
        for(int i=1;i<=9;i++){
            if(safe(r,c,board,i)){
                board[r][c]=(char)('0'+i);
                if(back(nextr,nextc,board)) return true;
            }
            board[r][c]='.';
        }
        return false;
    }
    public boolean safe(int r,int c,char[][] board,int n){
        for(int i=0;i<9;i++){
            if(board[i][c]==(char)('0'+n)) return false;
        }
        for(int i=0;i<9;i++){
            if(board[r][i]==(char) ('0'+n)) return false;
        }
        int sr=(r/3)*3;
        int sc=(c/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==(char)('0'+n)) return false;
            }
        }
        return true;


    }
}