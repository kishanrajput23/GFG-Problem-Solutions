class Solution {
  public:
    vector<int> findDuplicates(vector<int>& arr) {
        // code here
        map<int, int> mp;
        
        for (auto i : arr) {
            mp[i]++;
        }
        
        vector<int> ans;
        
        for (auto i : mp) {
            if (i.second == 2) {
                ans.push_back(i.first);
            }
        }
        
        return ans;
    }
};