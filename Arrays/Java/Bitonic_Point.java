class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        int max = 0;
        for (int i=0; i<n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
