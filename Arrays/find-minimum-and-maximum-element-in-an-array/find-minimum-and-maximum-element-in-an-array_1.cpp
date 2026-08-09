class Solution {
  public:
    vector<int> getMinMax(vector<int> &arr) {
        // code here
        int maxi = INT_MIN;
        int mini = INT_MAX;
        
        for (auto i : arr) {
            maxi = max(maxi , i);
            mini = min(mini, i);
        }
        
        return {mini, maxi};
    }
};