class Solution {
  public:
    string sortString(string &s) {
        // code here
        sort(s.begin(), s.end());
        
        return s;
    }
};