class Solution {
  public:
    int totalDigits(int n) {
        // code here
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num > 0) {
                count++;
                num /= 10;
            }
        }
        return count;
    }
};