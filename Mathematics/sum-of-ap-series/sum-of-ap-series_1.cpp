class Solution {
  public:
    int sumOfAP(int n, int a, int d) {
        // Code here.
        int sum = a;
        
        for (int i=1; i<n; i++) {
            int ith_term = a + (d * i);
            sum += ith_term;
        }
        
        return sum;
    }
};