class Solution {
  public:
    string toLower(string& s) {
        // code here
        for (int i=0; i<s.size(); i++) {
            if (isupper(s[i])) {
                s[i] = tolower(s[i]);
            }
        }
        
        return s;
    }
};