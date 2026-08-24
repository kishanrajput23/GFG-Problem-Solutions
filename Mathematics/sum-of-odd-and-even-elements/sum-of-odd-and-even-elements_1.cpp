
class Solution {
  public:
    vector<int> findSum(int n) {
        // Code here
        vector<int> ans(2);
        for (int i=1; i<=n; i++) {
            if (i % 2 == 0) {
                ans[1] += i;
            }
            else {
                ans[0] += i;
            }
        }
        return ans;
    }
};