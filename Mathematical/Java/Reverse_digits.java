class Solution
{
    public long reverse_digit(long n)
    {
        // Code here
        long rev = 0;
        while (n!=0) {
            long digit = n%10;
            rev = rev *10 + digit;
            n/=10;
        }
        return rev;
    }
}
