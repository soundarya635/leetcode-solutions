class Solution {

    public String decodeString(String s) {
        return decode(s);
    }

    int i = 0;

    public String decode(String s) {
        StringBuilder st = new StringBuilder();

        while (i < s.length() && s.charAt(i) != ']') {
            if (Character.isLetter(s.charAt(i)))
                st.append(s.charAt(i++));
            else {
                int num = 0;
                    while(Character.isDigit(s.charAt(i))) {
                        num = (num * 10) + Integer.parseInt(s.charAt(i) + "");
                        i++;
                    }
                    
                    i++;

                    String inner=decode(s);
                    i++ ;
                    for(int k=0;k<num;k++) st.append(inner);

                }
            
        }
        return st.toString();

    }
}