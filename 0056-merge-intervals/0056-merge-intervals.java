class Solution {
    public int[][] merge(int[][] in) {
        Arrays.sort(in,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> a=new ArrayList<>();
        int[] prev=in[0];
        for(int i=1;i<in.length;i++){
            if(in[i][0]<=prev[1]){
                prev[1]=Math.max(in[i][1],prev[1]);
            }else{
                a.add(prev);
                prev=in[i];
            }
        }
        a.add(prev);
        int[][] re=new int[a.size()][2];
        int i=0;
        for(int[] j:a){
            re[i++]=j;
        }
        return re;
    }
}