class Solution {
  public:
    long long nPr(int n, int r) {
        // code here
        long factn = 1;
        long factn_r = 1;

        for (int i=1; i<=n; i++){
            factn = factn*i;
        }

        for (int i=1; i<=n-r; i++){
            factn_r = factn_r*i;
        }

        long ans = factn / factn_r;
        
        return ans;
    }
};