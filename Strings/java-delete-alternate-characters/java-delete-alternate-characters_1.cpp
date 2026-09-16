class Solution {
  public:
    string delAlternate(string s) {
        // code here
        string str = "";
        
        for(int i=0; i<s.length(); i=i+2) {
            str += s[i];
        }
        
        return str;
    }
};