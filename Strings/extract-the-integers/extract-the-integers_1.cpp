class Solution {
  public:
    vector<string> extractInt(string &s) {
        // code here
        vector<string> v;
        string str;
        
        for (int i=0; i<s.length(); i++) {
            if (isdigit(s[i])) {
                str = s[i];
                
                while (isdigit(s[i+1])) {
                    str += s[i+1];
                    i++;
                }
                
                v.push_back(str);
            }
        }
        return v;
    }
};