class Solution {
    String firstAlphabet(String S) {
        // code here
        String s="";
        if (S.charAt(0)!=' ') {
            s = s + S.charAt(0);
        }
        for (int i=1; i<S.length(); i++) {
            if (S.charAt(i-1) == ' '){
                s = s + S.charAt(i);
            }
        }
        return s;
    }
};
