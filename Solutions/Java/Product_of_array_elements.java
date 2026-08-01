class GfG
{
    public static Long product(Long arr[], Long mod, int n)
    {
        //yout code here
        long prod = 1;
        for(int i=0; i<arr.length; i++) {
            prod = (prod * arr[i])%mod;
        }
        return prod;
    }
}
