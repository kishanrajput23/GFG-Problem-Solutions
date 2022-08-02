class Solution {
    int numOfsubarrays(int[] arr, int n) {
        // code here
        int sum, pr;
        int k=n;
        for (int i=0; i<n; i++) {
            sum = arr[i];
            pr = arr[i];
            for (int j=i+1; j<n; j++) {
                sum += arr[j];
                pr *= arr[j];
                if (sum == pr) {
                    k++;
                    break;
                }
            }
        }
        return k;
    }
}
