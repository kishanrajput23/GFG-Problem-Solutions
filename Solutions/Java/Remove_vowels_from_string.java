class Solution {
    String removeVowels(String S) {
        // code here
        String s = S.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "");
        return s;
    }
}
