class Solution {
  public:
    bool isDisarium(int n) {
        // code here
        int count = log10(n) + 1;
        int sum = 0;
        int num = n;

        while (num != 0) {
            int rem = num%10;
            sum += pow(rem, count);
            count--;
            num /= 10;
        }
        
        if (n == sum) {
            return true;
        }
        return false;
    }
};