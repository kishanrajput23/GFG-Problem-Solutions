class Solution
{
    public long[] find(int l, int b, int h)
    {
        // code here
        long L = l;
        long B = b;
        long H = h;
        return new long[] {2*((L*B) + (B*H) + (H*L)), L*B*H};
    }
}
