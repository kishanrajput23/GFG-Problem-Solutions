class Solution {
public:
    bool divisibleBy4(string& s) {
        int n = s.size();

        int lastTwo = (s[n - 2] - '0') * 10 + (s[n - 1] - '0');

        return lastTwo % 4 == 0;
    }
};