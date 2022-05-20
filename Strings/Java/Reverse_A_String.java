class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String rev = "";
        int len = str.length();
        for (int i=len-1; i>=0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
}
