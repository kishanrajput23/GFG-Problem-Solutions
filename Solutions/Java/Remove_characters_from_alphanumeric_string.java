class Solution {
    String removeCharacters(String S) {
        // code here
         String s = "";
        for (int i=0; i<S.length(); i++) {
            if (Character.isDigit(S.charAt(i))) {
                s += S.charAt(i);
            }
        }
        return s;
    }
}
