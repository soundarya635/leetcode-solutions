class Solution {
    public int orangesRotting(int[][] g) {
        int n=g.length;
        int m=g[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(g[i][j]==2){
                    int[] a=new int[2];
                    a[0]=i;
                    a[1]=j;
                    q.add(a);
                } 
            }
        }
        int c=-1;
        while(!q.isEmpty()){
            int s=q.size();
            for(int k=0;k<s;k++){
                int a[]=q.poll();
                int i=a[0];int j=a[1];
                if(i>0) addg(g,q,i-1,j);
                if(j>0) addg(g,q,i,j-1);
                if(j<m-1) addg(g,q,i,j+1);
                if(i<n-1) addg(g,q,i+1,j);
            }
            c++;
        }
        boolean f=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(g[i][j]==1) f=true;
            }
        }
        if(f) return -1;
        if(c==-1) return 0;
        return c;
    }
    public void addg(int[][] g,Queue<int[]> q,int i,int j){
        if(g[i][j]==0) return ;
        if(g[i][j]==2) return;
        g[i][j]=2;
        int a[]=new int[2];
        a[0]=i;
        a[1]=j;
        q.add(a);

    }
}