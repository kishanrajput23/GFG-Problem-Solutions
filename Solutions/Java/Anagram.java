class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        int count[]=new int[26];
        if (a.length() != b.length()) {
            return false;
        }
        for (int i=0; i<a.length(); i++) {
            count[a.charAt(i)-'a']++;
            count[b.charAt(i)-'a']--;
        }
        for (int i=0; i<26; i++) {
            if (count[i]>=1 || count[i]<=-1) {
                return false;
            }
       }
        return true;
    }
}
