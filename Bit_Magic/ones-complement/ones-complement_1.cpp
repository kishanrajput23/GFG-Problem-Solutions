class Solution {
public:
    int onesComplement(int n) {
        int num = n;
        int mask = 0;

        while (num > 0) {
            mask = (mask << 1) | 1;
            num >>= 1;
        }

        return n ^ mask;
    }
};