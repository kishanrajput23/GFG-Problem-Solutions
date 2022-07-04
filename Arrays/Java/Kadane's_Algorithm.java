class Solution{
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        // Your code here
        int max_sum=-10001, cal_sum=0;
        for (int i=0; i<n; i++) {
            cal_sum += arr[i];
            if (cal_sum>max_sum) {
                max_sum = cal_sum;
            }
            if (cal_sum<0) {
                cal_sum = 0;
            }
        }
        return max_sum;
    }
    
}
