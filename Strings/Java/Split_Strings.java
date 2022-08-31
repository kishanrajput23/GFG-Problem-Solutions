class Solution 
{ 
    static List<String> splitString(String S) 
    { 
        // code here 
        ArrayList<String> arr = new ArrayList<>();
        String s1 = "";
        String s2 = "";
        String s3 = "";
        for (int i=0; i<S.length(); i++) {
            if (Character.isAlphabetic(S.charAt(i))) {
                s1 += S.charAt(i);
            }
            else if (Character.isDigit(S.charAt(i))) {
                s2 += S.charAt(i);
            }
            else {
                s3 += S.charAt(i);
            }
        }
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        return arr;
    }
} 
