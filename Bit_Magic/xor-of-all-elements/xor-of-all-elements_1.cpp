class Solution {
  public:
    vector<int> getXor(vector<int>& arr) {
        // code here
        vector<int> ans;
        
        int num = 0;
        
        for (auto i : arr) {
            num ^= i;
        }
        
        for (auto i : arr) {
            ans.push_back(i^num);
        }
        
        return ans;
    }
};