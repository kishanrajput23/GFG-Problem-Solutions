class Solution {
  public:
    string transformString(string &s) {
        // code here
        string str = "";

        for (int i=0; i<s.length(); i++) {
            if (islower(s[i])) {
                char ch = 'z' - s[i] + 'a';
                str += ch;
            }

            if (isupper(s[i])) {
                char ch = 'Z' - s[i] + 'A';
                str += ch;
            }
        }
        
        return str;
    }
};