class Solution {
public:
    int convertFive(int n) {
        if (n == 0)
            return 5;

        int num = 0;

        while (n > 0) {
            int rem = n % 10;

            if (rem == 0)
                rem = 5;

            num = num * 10 + rem;
            n /= 10;
        }

        // Reverse the result
        int ans = 0;
        while (num > 0) {
            ans = ans * 10 + num % 10;
            num /= 10;
        }

        return ans;
    }
};