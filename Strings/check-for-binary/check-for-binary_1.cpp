class Solution {
  public:
    bool isBinary(string& s) {
        // code here
        int n = s.length();

        for(int i=0; i<n; i++) {

            char ch = s[i];

            if (ch !='0' && ch !='1') { 
                return false;
            }
        }

        return true;
    }
};