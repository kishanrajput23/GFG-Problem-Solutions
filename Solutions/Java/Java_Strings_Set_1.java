class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        String sum = S1+S2;
        String ans = "";
        for (int i=sum.length()-1; i>=0; i--) {
            ans = ans + sum.charAt(i); 
        }
        return ans;
    }
}
