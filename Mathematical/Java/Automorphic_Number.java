class Solution
{
    public String is_AutomorphicNumber(int n)
    {
        // Code here
        int num=n*n,d1,d2;
        while(n!=0){
            d1=n%10;
            d2=num%10;
            if(d1!=d2){
                return "Not Automorphic";
            }
            n=n/10;
            num=num/10;
        }
        return "Automorphic";
    }
}
