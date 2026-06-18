class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        int l=0,cr=m[0].length-1,r=m.length-1;
        int cl=0;
        ArrayList<Integer> a=new ArrayList<>();
        while(l<=r && cl<= cr ){
            for(int i=cl;i<=cr;i++){
                a.add(m[l][i]);
            }l++;
            for(int i=l;i<=r;i++){
                a.add(m[i][cr]);
            }cr--;
            if(l<=r){
            for(int i=cr;i>=cl;i--){
                a.add(m[r][i]);
            }
            r--;}
            if(cl<=cr){
                for(int i=r;i>=l;i-- ){
                    a.add(m[i][cl]);
                }
                cl++;
            }
        }
        return a;
    }
}