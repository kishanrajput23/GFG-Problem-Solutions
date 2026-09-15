class Solution {
  public:
    string removeVowels(string& s) {
        // code here
        string ans = "";
        
        for (char ch : s) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            }
            else {
                ans += ch;
            }
        }
        
        return ans;
    }
};