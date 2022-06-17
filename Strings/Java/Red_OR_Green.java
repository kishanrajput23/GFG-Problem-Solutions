class Solution {
    static int RedOrGreen(int N, String S) {
        //code here
        int r=0, g=0;
        for (int i=0; i<S.length(); i++) { 
            if (S.charAt(i) == 'R') {
                r++;
            }
            else {
                g++;
            }
        }
        return Math.min(r, g);
    }
}
