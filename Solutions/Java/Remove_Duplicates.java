class Solution {
    String removeDups(String S) {
        // code here
        StringBuilder sb = new StringBuilder();
        for (int i=S.length()-1; i>=0; i--) {
            char c = S.charAt(i);
            int x = S.indexOf(c);
            if (x<i) {
                continue;
            }
            sb.append(c);
        }
        return sb.reverse().toString();
    }
}
