class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=Integer.MIN_VALUE;
        HashSet<Character> h=new HashSet<>();
        int l=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            while(h.contains(ch)){
                h.remove(s.charAt(l));
                l++;

            }
            h.add(ch);
            max=Math.max(max,r-l+1);
        }
        if(max>0)return max;
        return 0;

    }
}