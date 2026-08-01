class Solution
{
    public long sum_of_square_oddNumbers(long n)
    {
        // Code here
        long ans = 0;
        long sq = 1;
        for (int i=1; i<=n; i++) {
            ans += sq*sq;
            sq += 2;
        }   
        return ans;
    }
}
