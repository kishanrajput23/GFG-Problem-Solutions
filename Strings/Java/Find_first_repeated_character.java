class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        HashSet<Character> hm = new HashSet<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (hm.contains(c)) {
                return Character.toString(c);
            }
            hm.add(c);
        }
        return "-1";
    }
} 
