class Solution
{
    public char nthCharacter(String S, int R, int N)
    {
        //code here\
        for (; R>0; N%=1<<R--) {
            S = S.charAt(N/(1<<R))=='0'?"01":"10";
        }
        return S.charAt(N);
    }
}
