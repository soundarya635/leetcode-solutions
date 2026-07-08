class Solution {
    public int trap(int[] h) {
        int l=0,r=h.length-1;
        int lmax=0,rmax=0;
        int res=0;

        while(l<=r){
            if(h[l]<h[r]){
                if(h[l]>lmax) lmax=h[l];
                else res+=lmax-h[l];
                l++;
            }else {
                if(h[r]>rmax) rmax=h[r];
                else res+=rmax-h[r];
                r--;
            }
            
        }
        return res;
    }
}