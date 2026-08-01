class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int total_length = n+m;
        int [] c = new int[total_length];
        for (int i=0; i<n; i++) {
            c[i] = arr1[i];
        }
        for (int i=0; i<m; i++) {
            c[i+n] = arr2[i];
        }
        Arrays.sort(c);
        long result = c[k-1];
        return result;
    }
}
