class Solution {
    public int[] fullBloomFlowers(int[][] f, int[] p) {
        int[] start=new int[f.length];
        int[] end=new int[f.length];
        for(int i=0;i<f.length;i++){
            start[i]=f[i][0];
            end[i]=f[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int ans[]=new int[p.length];
        for(int i=0;i<p.length;i++){
            int c=st(start,p[i]);
            int d=en(end,p[i]);
            ans[i]=c-d;
        }
        return ans;
        
    }
    public int st(int [] start,int p){
        int l=0,h=start.length-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(start[mid]>p){
                ans=mid;
                h=mid-1;
            }else l=mid+1;
        }if(ans==-1) return start.length;
        return ans;
    }
     public int en(int [] end,int p){
        int l=0,h=end.length-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(end[mid]>=p){
                ans=mid;
                h=mid-1;
            }else l=mid+1;
        }
        if(ans==-1) return end.length;
        return ans;
    }
}