class Solution {
  public:
    string roundToNearest(string& s) {
        // Code Here
        int n = s.size();

        char lastChar = s[n-1];

        if (lastChar <= '5') {
            s[s.size()-1] = '0';
            return s;
        }

        s[n-1] = '0';
        int i = n-2;

        while (i >= 0 && s[i] == '9') {
            s[i] = '0';
            i--;
        }

        if (i < 0) {
            return '1' + s;
        }
        else {
            s[i]++;
        }

        return s;        
    }
};