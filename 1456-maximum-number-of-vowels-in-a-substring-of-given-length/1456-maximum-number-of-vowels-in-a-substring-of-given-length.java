class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int c=0,l=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(isVowel(ch)) c++;
            if(k==i-l+1){
                max=Math.max(c,max);
                if(isVowel(s.charAt(l))) c--;
                l++;
            }
        }
        return max;
    }
    public boolean isVowel(char ch){
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') return true;
        return false;
    }
}