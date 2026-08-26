class Solution {
  public:
    int calculateFutureValue(int p, int t, int n, int r) {
        // code here
        double result = p * pow(1 + r / (100.0 * n), n * t);

        return floor(result);
    }
};