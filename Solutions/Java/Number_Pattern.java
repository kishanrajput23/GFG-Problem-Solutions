class Solution{
    ArrayList<String> numberPattern(int N){
        // code here
        String s="";
        ArrayList<String> str = new ArrayList<String>();
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=i; j++) {
                s = s + String.valueOf(j);
            }
            for (int j=i-1; j>0; j--) {
                s = s + String.valueOf(j);
            }
            str.add(s);
            s = "";
        }
        return str;
    }
}
