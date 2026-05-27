class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> c=new HashSet<>();
        HashSet<Character> l=new HashSet<>();
        int r=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if('a'<=ch && ch<='z') l.add(ch);
            else c.add(ch);

        }
        for(Character i:l){
            char ch=Character.toUpperCase(i);
            if(c.contains(ch)) r++;
        }
        return r;
    }
}