class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int count = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] == 0) {
                count += 1;
            }
            else {
                int k = arr[i-count];
                arr[i-count] = arr[i];
                arr[i] = k;
            }
        }
    }
}
