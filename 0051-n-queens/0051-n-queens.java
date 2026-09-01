class Solution {
    List<List<String>> res=new ArrayList<>();
    char board[][];
    Set<Integer> pos=new HashSet<>();
    Set<Integer> neg=new HashSet<>();
    Set<Integer> c=new HashSet<>();

    public List<List<String>> solveNQueens(int n) {
        board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }  
        back(0,n);
        return res;  
        
    }
    public void back(int r,int n){
        if(r==n){
            List<String> l=new ArrayList<>();
            for(int i=0;i<r;i++){
                l.add(new String(board[i]));

            }
            res.add(l);
            return;
        }
        for(int i=0;i<n;i++){
            if(!(c.contains(i)|| pos.contains(r+i)||neg.contains(r-i))){
                c.add(i);
                pos.add(r+i);
                neg.add(r-i);
                board[r][i]='Q';
                back(r+1,n);
                board[r][i]='.';
                c.remove(i);
                pos.remove(r+i);
                neg.remove(r-i);
            }
        }
    }
}