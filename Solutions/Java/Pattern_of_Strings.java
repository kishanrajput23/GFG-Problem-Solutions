class Solution {
    ArrayList<String> pattern(String S) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        int n = S.length();
        for (int i=0; i<n; i++) {
            ans.add(S.substring(0, n-i));
        }
        return ans;
    }
};
