class Solution {
  public:
    vector<int> printPat(int n) {
        // write code here
        vector<int> ans;

        for(int row = n; row > 0; row--) {
            for(int num = n; num > 0; num--) {
                for(int times = 1; times <= row; times++) {
                    ans.push_back(num);
                }
            }
            ans.push_back(-1);
        }
        return ans;
    }
};