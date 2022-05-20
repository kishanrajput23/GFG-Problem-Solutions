class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int total = (n + 1) * (n) / 2;
        for (int i=0; i<n-1; i++) {
            total -= array[i];
        }
        return total;
    }
}
