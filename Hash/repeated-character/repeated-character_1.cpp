class Solution {
  public:
    char firstRep(string s) {
        // code here.
        vector<int> v(26, 0);
        
        for (auto i : s) {
            v[i-'a']++;
        }
        
        for (auto i : s) {
            if (v[i-'a'] > 1) {
                return i;
            }
        }
        return '#';
    }
};