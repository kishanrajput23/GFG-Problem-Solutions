class Solution {
    static String delAlternate(String S) {
        // code here
        String str = "";
        for(int i=0; i<S.length(); i=i+2) {
            str = str + S.charAt(i);
        }
        return str;
    }
}
