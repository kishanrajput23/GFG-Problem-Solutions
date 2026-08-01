class Solution {

    public long findMissing(long a[], long b[], int n) {
        int missnum=0;
        for (int i=0; i<n; i++) {
            missnum ^= a[i];
        }
        for (int i=0; i<n-1; i++){
            missnum ^= b[i];
        }
        return missnum;
    }
}
