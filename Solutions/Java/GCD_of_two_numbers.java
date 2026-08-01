class Solution
{
    public int gcd(int A , int B) 
    { 
        //code here
        if (A==0) {
            return B;
        }
        return gcd(B%A, A);
    } 
}
