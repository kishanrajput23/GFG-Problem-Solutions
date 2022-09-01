class Solution
{
    public long find_fact(int n)
    {
        // Code here
        if (n==0) {
            return 1;
        }
        else {
            return n*find_fact(n-1);
        }
    }
}
