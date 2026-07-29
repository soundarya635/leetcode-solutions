class Solution {
    public int maxConsecutiveAnswers(String a, int k) {
        int l=0,f=0,t=0,max=Integer.MIN_VALUE;
        for(int r=0;r<a.length();r++ ){
            if(a.charAt(r)=='F') f++;
            else t++;
            while(Math.min(t,f)>k){
                if(a.charAt(l)=='F') f--;
                else t--;
                l++;

            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}