class Solution {
  public:
    bool armstrongNumber(int n) {
        // code here
        int total = 0; 
        int temp = n;
        
        while (temp != 0) {
            int rem = temp%10;
            total += rem * rem * rem;
            temp /= 10;
        }

        if (total == n) {
            return true;
        }
        else {
            return false;
        }
    }
};