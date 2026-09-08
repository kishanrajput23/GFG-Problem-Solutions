class Solution {
  public:
    int getOddOccurrence(vector<int>& arr) {
        // code here
        int ans = 0;

        for (auto x : arr) {
            ans ^= x;
        }

        return ans;
    }
};