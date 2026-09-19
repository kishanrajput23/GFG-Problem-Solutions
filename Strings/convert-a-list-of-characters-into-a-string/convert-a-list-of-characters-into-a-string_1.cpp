class Solution {
  public:
    string charToStr(vector<string> &arr) {
        // code here
        string ans = "";
        
        for (auto i : arr) {
            ans += i;
        }
        
        return ans;
    }
};