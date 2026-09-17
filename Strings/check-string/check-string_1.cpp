class Solution {
  public:
    bool allCharactersSame(string &s) {
        // code here
        char first = s[0];
        
        for (int i=1; i<s.length(); i++) {
           if (first != s[i]) {
               return false;
            }
        }  
        
        return true;
    }
};