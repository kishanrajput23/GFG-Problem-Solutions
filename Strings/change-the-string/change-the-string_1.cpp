class Solution {
  public:
    string modify(string& s) {
        // code here
        bool upper = isupper(s[0]);
        
        for (int i=0; i<s.size(); i++) {
            if (upper) {
                s[i] = toupper(s[i]);
            }
            else {
                s[i] = tolower(s[i]);
            }
        }
        return s;
    }
};