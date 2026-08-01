class Solution {
    
    public String reverse(String S){
        //code here
        Stack<Character> stk = new Stack<>();
        for (int i=0; i<S.length(); i++){
            stk.push(S.charAt(i));
        }
        String s2="";
        int j=0;
        while (j<S.length()) {
            s2 = s2 + stk.pop();
            j++;
        }
        return s2;
    }

}
