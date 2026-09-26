class Solution {
  public:
    vector<int> getMoreAndLess(vector<int> &arr, int target) {
        // code here
        int smaller = 0;
        int greater = 0;
        
        for (auto i : arr) {
            if (i <= target) {
                smaller++;
            }
            
            if (i >= target) {
                greater++;
            }
        }
        
        return {smaller, greater};
    }
};