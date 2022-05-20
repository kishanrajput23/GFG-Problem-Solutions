class Solution {
    static int findTime(String S1 , String S2) {
        // code here
        int total = 0;
        int curr = 0;
        for (int i=0; i<S2.length(); i++) { 
            char ch = S2.charAt(i);
            int finger = S1.indexOf(ch); 
            total += Math.abs(curr - finger);
            curr = finger;
        }
        return total;
    }
};
