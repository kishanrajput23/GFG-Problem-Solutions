class Solution {
    public long countSub(String str) {
        // Your code goes here
        int close = 0;
        int i;
        for (i=0; i<str.length(); i++) {
            if (str.charAt(i) ==')') {
               close++;
            }
        }
        return close;
    }
}
