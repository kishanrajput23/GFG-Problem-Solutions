class Solution {
    static String triDownwards(String S){
        // code here
        String dots = "";
        String text = "";
        for (int i=0; i<=S.length()-1; i++) {
            for (int j=1; j<=i; j++) {
                dots += ".";
            }
            text = S.substring(i, S.length());
            System.out.println(dots+text);
            dots="";
        }
        return "";
    }
};
