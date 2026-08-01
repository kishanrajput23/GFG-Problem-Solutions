class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        String[] strArr = S.split("\\.");
        String reverseStr = "";
        for (int i=strArr.length-1; i>=0; i--) {
            reverseStr += "."+ strArr[i];
        }
        return reverseStr.substring(1);
    }
}
