class Solution
{
    String modify (String s)
    {
        // your code here
        
        Stack<Character> v = new Stack<>();
        char[] str = s.toCharArray();
        s = "";

        for (int i=0; i<str.length; i++) {
            char temp = str[i];
            if (temp=='a' || temp=='e' || temp=='i' || temp=='o' || temp=='u') {
                v.push(temp);
            }
        }
        
        for(int i=0; i<str.length; i++) {
            char temp = str[i];
            if (temp=='a' || temp=='e' || temp=='i' || temp=='o' || temp=='u') {
                str[i] = v.pop();
            }
            s += str[i];
        }
        return s;
    }
}
