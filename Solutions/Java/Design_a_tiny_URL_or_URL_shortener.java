class Solution {
    String idToShortURL(long n) {
        // code here
        String ans = "";
        String url = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        while (n>0) {
            ans = url.charAt((int)(n%62)) + ans;
            n/=62;
        }
        return ans;
    }
}
