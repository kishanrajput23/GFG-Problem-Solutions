class Solution {
    public int lastIndex( String s) {
        int r = -1;
        for (int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i) == '1') {
                r = i;
                break;
            }
        }
        return r;
    }
}
