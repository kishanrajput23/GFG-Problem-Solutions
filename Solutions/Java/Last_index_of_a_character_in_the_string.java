class Solution{
    int LastIndex(String s, char p){
        // code here
        for (int i=s.length()-1; i>=0; i--) {
            if (s.charAt(i) == p) {
                return i;
            }
        }
        return -1;
    }
}
