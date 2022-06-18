class Solution {
    public int isReversible(String str, int n) {      
        //complete the function here
        for (int i=0; i<n/2; i++) {
            if (str.charAt(i) != str.charAt(n-1-i)) {
                return 0;
            }
        }
        return 1;
    } 
}
