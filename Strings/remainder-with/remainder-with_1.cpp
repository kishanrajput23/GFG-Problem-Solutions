class Solution {
public:
    int remainderWith7(string &n) {
        int rem = 0;

        for (char c : n) {
            rem = (rem * 10 + (c - '0')) % 7;
        }

        return rem;
    }
};