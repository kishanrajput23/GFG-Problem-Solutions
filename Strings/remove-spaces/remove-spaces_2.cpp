class Solution {
public:
    string removeSpaces(string& s) {
        int j = 0;

        for (char c : s) {
            if (c != ' ') {
                s[j++] = c;
            }
        }

        s.resize(j);
        return s;
    }
};