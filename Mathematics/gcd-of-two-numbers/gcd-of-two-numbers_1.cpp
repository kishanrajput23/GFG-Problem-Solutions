class Solution {
  public:
    int gcd(int a, int b) {
        // code here
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
};
