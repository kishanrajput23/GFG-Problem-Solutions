class Solution {
  public:
    int arraySum(vector<int>& arr) {
        // code here
        int ans = 0;
        for (auto i : arr) {
            ans += i;
        }
        return ans;
    }
};