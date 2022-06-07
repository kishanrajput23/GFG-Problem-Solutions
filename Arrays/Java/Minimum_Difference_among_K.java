class Solution
{
    long minDiff(long a[] ,int N,int K)
    {
    
        Arrays.sort(a);
        long ans = Integer.MAX_VALUE;
        for (int i=0; i<=N-K; i++) {
            long min = a[i];
            long max = a[i+K-1];
            long d = max-min;
            if (ans > d) {
                ans = d;
            }
        }
        return ans;
    }
}
