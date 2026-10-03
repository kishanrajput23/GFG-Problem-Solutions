class Solution {
  public:
    int digitalRoot(int n) {
        // code here
         return --n % 9 + 1;
    }
};