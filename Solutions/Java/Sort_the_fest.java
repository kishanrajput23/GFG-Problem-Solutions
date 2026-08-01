class Solution
{
    public String  is_common(String [] s, String [] t)
    {
        // Code here
        HashSet<String> hs = new HashSet<>();
        String ans = "BEHAPPY";
       
        for (String x : s) {
            hs.add(x);
        }
        for (String y : t) {
            if (hs.contains(y)) {
                ans = "CHANGE";
                break;
            }
        }
        return ans;
    }
}
