class Solution {
  public:
    int isSumPalindrome(int n) {
        // code here
        int i = 0;
        
        while (i <= 5) {
            int rev = 0;
            int temp = n;
            
            while (n > 0) {
                int rem = n % 10;
                rev = rev*10 + rem;
                n /= 10;
            }

            if (temp == rev) {
                return rev;
            }
            n = temp + rev;
            i++;
        }
        return -1;
    }
};