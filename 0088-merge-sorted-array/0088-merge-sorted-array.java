class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int f=m-1,l=n-1;
        for(int i=nums1.length-1;i>=0;i--){
            if(l<0) nums1[i]=nums1[f--];
            else if(f<0) nums1[i]=nums2[l--];
            else if(nums1[f]>nums2[l]) nums1[i]=nums1[f--];
            else nums1[i]=nums2[l--];
        }
    }
}