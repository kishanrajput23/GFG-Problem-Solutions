class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String str) {
        // your code here
        str=str.toLowerCase();
        int c[]=new int[26];
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)>=97 && str.charAt(i)<=123) {
                c[str.charAt(i)-'a']++;
            }
        }
        for (int i=0; i<26; i++) {
            if (c[i]==0) {
                return false;
            }
        }
        return true;
    }
