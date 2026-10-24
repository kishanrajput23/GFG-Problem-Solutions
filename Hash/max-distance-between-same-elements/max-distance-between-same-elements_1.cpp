class Solution {
  public:
    int maxDistance(vector<int> &arr) {
        // Code here
        int maxi = INT_MIN;
        
        unordered_map<int, int> mp;
        
        for (int i=0; i<arr.size(); i++) {
            if (mp.find(arr[i]) != mp.end()) {
                maxi = max(maxi, i - mp[arr[i]]);
            }
            else {
                mp[arr[i]] = i;
            }
        }
        
        return maxi == INT_MIN ? 0 : maxi;
    }
};
