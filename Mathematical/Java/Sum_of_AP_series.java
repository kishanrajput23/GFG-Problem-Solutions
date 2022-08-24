class Solution
{
    public long sum_of_ap(long n, long a, long d)
    {
        // Code here
        long ans = 0;
        ans = n * (2 * a + (n-1) * d) / 2;
        return ans;
    }
}
