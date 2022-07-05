class GFG {
    String longest(String names[], int n) {
        int MAX=0;
        String ans="";
        for (int i=0; i<n; i++) {
            if (names[i].length() > MAX) {
                MAX = names[i].length();
                ans = names[i];
            }
        }
        return ans; 
    }
}
