class Solution {
    public static int fact(int n) {
        if (n == 0)
            return 1;
        return n * fact(n - 1);
   }
   
    int isPerfect(int N) {
        int m = N;
        int sum = 0;
        while (N!=0) {
            int k = N%10;
            sum = fact(k) + sum;
            N = N/10;
        }
        
        if (sum == m) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
