class Solution {
  public:
    int firstNonRepeating(vector<int>& arr) {
        // code here
        map<int, int> mp;
        
        for (auto i : arr) {
            mp[i]++;
        }
        
        for (auto i : arr) {
            if (mp[i] == 1) {
                return i;
            }
        }
        
        return 0;
    }
};
