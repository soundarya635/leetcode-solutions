class Solution {

    public String decodeString(String s) {
        Stack<Integer> c=new Stack<>();
        Stack<StringBuilder> st=new Stack<>();

        StringBuilder cur=new StringBuilder();
        int num =0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                num=(num*10) + Integer.parseInt(s.charAt(i)+"");
            }else if(s.charAt(i)=='['){
                c.push(num);
                st.push(cur);
                num=0;
                cur=new StringBuilder();
            }else if(s.charAt(i)==']'){
                int repeat=c.pop();
                StringBuilder prev=st.pop();

                for(int k=0;k<repeat;k++){
                    prev.append(cur);
                }
                cur=prev;
            }else cur.append(s.charAt(i));
        }
        return cur.toString();
    }

   
}