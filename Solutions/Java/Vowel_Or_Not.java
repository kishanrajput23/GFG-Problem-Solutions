class Solution{
    String isVowel(char c){
        // code here
        char m = Character.toUpperCase(c);
        if (m=='A'|| m=='E'|| m=='I'||m=='O'|| m=='U') {
            return "YES";
        }
        else
            return "NO";
    }
}
