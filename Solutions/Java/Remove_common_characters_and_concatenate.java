class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
        // Your code here
        String res = "";
        for (Character c : s1.toCharArray()) {
            if (!s2.contains(c.toString())) {
                res += c.toString();
            }
        }
        for (Character c : s2.toCharArray()) {
            if (!s1.contains(c.toString())) {
                res += c.toString();
            }
        }
        if (res.length() == 0) {
            return "-1";
        }
        return res;
    }
}
