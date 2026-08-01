class Solution{
    String modify(String s) {
        char[] charArray = s.toCharArray();
        if (Character.isLowerCase(charArray[0])) {
            return (String) s.toLowerCase();
        }
        return (String) s.toUpperCase();
    }
}
