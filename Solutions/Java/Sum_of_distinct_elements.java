class Solution {
    int findSum(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int sum=0;
        for (int i=0; i<n-1; i++) {
            if (arr[i]!=arr[i+1]) {
                sum+=arr[i];
            }
        }
        sum+=arr[n-1];
        return sum;
    }
}
