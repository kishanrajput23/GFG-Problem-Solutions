class Solution {
public:
    bool divisibleBy11(string &s) {
        int diff = 0;

        for (int i = 0; i < s.size(); i++) {
            if (i % 2 == 0)
                diff += s[i] - '0';
            else
                diff -= s[i] - '0';
        }

        return diff % 11 == 0;
    }
};