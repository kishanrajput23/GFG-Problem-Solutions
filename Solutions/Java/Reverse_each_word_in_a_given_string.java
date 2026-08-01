class Solution
{
   
    String reverseWords(String S)
    {
        StringBuilder sb=new StringBuilder("");
        Stack<Character> st=new Stack<>();
        for(int i=0;i<S.length();i++) {
            char c=S.charAt(i);
            if(c!='.')
                st.push(c);
            else {
                while(st.size()>0)
                    sb.append(st.pop());
                sb.append('.');
            }
        }
        while(st.size()>0)
        sb.append(st.pop());
        return sb.toString();
        
    }
}
