class Solution {
    static String revStr(String S) {
        // code here
        String res = "";
        for (int i=S.length()-1; i>=0; i--) {
            res += S.charAt(i);
        }
        return res;
    }
}
