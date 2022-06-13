class Solution{
    static String removeChars(String string1, String string2){
        // code here
        String s = "";
        for (int i = 0; i<string1.length(); i++) {
            if (!string2.contains(String.valueOf(string1.charAt(i)))) {
              s = s + string1.charAt(i);
            }
        }
        return s;
    }
}
