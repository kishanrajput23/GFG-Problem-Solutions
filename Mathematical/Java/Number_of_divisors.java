class Solution{
    static long count_divisors(int N){
        // code here
        long count=0;
        if (N%3==0) {
            for (int i=3; i<=N; i=i+3) {
                if (N%i==0) {
                    count++;
                }
            }
        }
        return count;
    }
}
