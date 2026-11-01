class Solution {
    public int findCircleNum(int[][] is) {
        int c=0;
        int n=is.length;
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,is,vis);
                c++;
            }
        }
        return c;
    }
    public void dfs(int i,int[][] is,boolean[] vis){
        vis[i]=true;
        for(int j=0;j<is[i].length;j++){
            if(!vis[j] && is[i][j]==1) dfs(j,is,vis);
        }
    }
}