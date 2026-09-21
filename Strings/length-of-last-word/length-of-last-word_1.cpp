class Solution {
public:
    int lastWordLen(string &s) {
        int i = s.size() - 1;

        // Skip trailing spaces
        while (i >= 0 && s[i] == ' ')
            i--;

        int len = 0;

        // Count last word
        while (i >= 0 && s[i] != ' ') {
            len++;
            i--;
        }

        return len;
    }
};