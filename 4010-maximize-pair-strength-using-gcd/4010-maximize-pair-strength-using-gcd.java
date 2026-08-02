class Solution {
    public long maxPairStrength(int[] nums) {
        long max=Long.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                Long s=((long)nums[i]*nums[j])/ (long)Math.pow(gcd((long)nums[i],(long)nums[j]),2);
                max=Math.max(s,max);
            }
        }
        return max;
    }
    public static long gcd(long n,long m){
        if(m==0) return n;
        return gcd(m,n%m);
    }
}