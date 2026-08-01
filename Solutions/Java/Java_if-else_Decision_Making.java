class Solution{
    static String compareNM(int n,int m){
        // code here
        if (n<m) {
            return "lesser";
        }
        if (n==m) {
            return "equal";
        }
        else {
            return "greater";
        }
    }
}
