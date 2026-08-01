class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int x = arr[i] * arr[i];
                    int y = arr[j] * arr[j];
                    int z = arr[k] * arr[k];
                    if ((x + y) == z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
