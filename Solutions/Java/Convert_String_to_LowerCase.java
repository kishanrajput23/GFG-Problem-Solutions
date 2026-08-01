class Solution {
    static String toLower(String S) {
        // code here
        String n = "";
        for(int i=0; i<S.length(); i++) {
            n += Character.toLowerCase(S.charAt(i));
        }
        return n;
    }
}
