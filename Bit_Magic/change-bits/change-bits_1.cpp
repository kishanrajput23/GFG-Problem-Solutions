class Solution {
public:
    vector<int> changeBits(int n) {
        if (n == 0)
            return {1, 1};

        int temp = n;
        int mask = 0;

        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }

        int newNum = n | mask;
        int difference = newNum - n;

        return {difference, newNum};
    }
};