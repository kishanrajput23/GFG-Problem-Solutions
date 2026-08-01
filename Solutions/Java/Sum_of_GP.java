class Solution
{
    public long sum_of_gp(long n, long a, long r)
    {
        // Code here
        if(r==1) {
            return n*a;
        }
        return (a*(((int)Math.pow(r,n))-1))/(r-1);
    }
}
