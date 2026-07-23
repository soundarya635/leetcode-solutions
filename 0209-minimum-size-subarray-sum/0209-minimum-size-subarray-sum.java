class Solution {
    public int minSubArrayLen(int t, int[] a) {
        int min =Integer.MAX_VALUE;
        int l=0,sum=0;
        for(int r=0;r<a.length;r++){
            sum+=a[r];
            while(sum>=t){
                min=Math.min(min,r-l+1);
                sum-=a[l];
                l++;
            }
        }
        if(min<a.length+1) return min;
        return 0;
    }
}