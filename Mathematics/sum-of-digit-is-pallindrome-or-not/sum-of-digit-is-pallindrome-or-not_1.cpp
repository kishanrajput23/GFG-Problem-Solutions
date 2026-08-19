class Solution {
  public:
    bool isPalindrome(int num) {
        int rev = 0;
        int n = num;
        
        while (num > 0) {
            int rem = num % 10;
            rev = rev*10 + rem;
            num /= 10;
        }
        return rev == n;
    }
    
    bool isDigitSumPalindrome(int n) {
        // code here
        int sum = 0;
        
        
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        
        return isPalindrome(sum);
        
    }
};