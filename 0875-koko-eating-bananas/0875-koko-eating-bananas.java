class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            // low=Math.min(low,piles[i]);
            high=Math.max(high,piles[i]);
        }
        int ans=0;
        while(low<=high){
            int mid=(low +(high-low)/2);
           
            if(eat(mid,piles,h)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public boolean eat(int n,int[] piles,int h){
        int sum=0;
        for(int i=0;i<piles.length;i++){
            sum+=Math.ceil((double)piles[i]/n);
            if(sum>h) return false;
        }
        return sum<=h;
    }
}