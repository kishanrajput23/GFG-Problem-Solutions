class Solution {
    String equilibrium(int arr[], int n) {
        // code here
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum+=arr[i];
        }
        int leftsum = 0;
        for (int i=0; i<n; i++) {
            if (sum-leftsum-arr[i] == leftsum) {
                return "YES";
            }
            leftsum += arr[i];
        }
        return "NO";
    }
}
