class Solution {
  public:
    string modify(string& s) {
        // code here
        string vowels = "";
        
        for (char ch : s) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels += ch;
            }
        }
        
        int n = vowels.size();
        
        for (int i=0; i<s.size(); i++) {
            if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
                s[i] = vowels[--n];
            }
        }
        
        return s;
    }
};
