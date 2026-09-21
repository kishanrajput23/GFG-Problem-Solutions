class Solution {
  public:
    int LastIndex(string &s, char c) {
        // code here
        for (int i = s.size() - 1; i >= 0; i--) {
            if (s[i] == c) {
                return i;
            }
        }
        return -1;
    }
};