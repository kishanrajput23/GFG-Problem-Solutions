class Solution {
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        // Your code here
        int sum1 = 0;
        int leftsum = 0;
        for (int i=0; i<n; i++) {
            sum1 += arr[i];
        }
        for (int i=0; i<n; i++) {
            sum1 -= arr[i];
            if (leftsum == sum1) {
                return i+1;
            }
            leftsum += arr[i];
        }
        return -1;
    }
}
