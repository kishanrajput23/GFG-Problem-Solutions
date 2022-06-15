class Solution
{
    char firstRep(String S)
    {
        // your code here
        for (int i=0; i<S.length()-1; i++) {
            if (S.substring(i+1, S.length()).contains(""+S.charAt(i))) {
                return S.charAt(i);
            }
        }
        return '#';
    }
}
