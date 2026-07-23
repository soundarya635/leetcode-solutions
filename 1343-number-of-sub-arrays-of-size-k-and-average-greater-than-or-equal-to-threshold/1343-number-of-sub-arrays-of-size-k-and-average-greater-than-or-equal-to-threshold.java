class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0;int sum=0;
        int c=0;
        for(int r=0;r<arr.length;r++){
            sum+=arr[r];
            if(k==r-l+1){
                if(sum/((float)k)  >= threshold) c++;
                sum-=arr[l];
                l++;
            }
        }
        return c;
    }
}