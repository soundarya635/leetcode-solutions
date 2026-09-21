class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int scol=image[sr][sc];
        if(scol==color) return image;
        fill(image,sr,sc,color,scol);
        return image;

    }
    public void fill(int[][] image,int i,int j,int col,int scol){
        if(i<0 || j<0 || i>=image.length || j>=image[0].length) return;
        if(image[i][j]!=scol) return;
        image[i][j]=col;
        fill(image,i+1,j,col,scol);
        fill(image,i,j+1,col,scol);
        fill(image,i,j-1,col,scol);
        fill(image,i-1,j,col,scol);
    }
}