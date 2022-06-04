class Solution {
    int maxProduct(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        return arr[n-1] * arr[n-2];
    }
}
