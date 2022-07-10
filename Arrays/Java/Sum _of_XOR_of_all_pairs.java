class Solution{
   
    // Function for finding maximum and value pair
    public long sumXOR (int arr[], int n) {
        //Complete the function
        long sum =0;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                sum += (arr[i]^arr[j]);
            }
        }
        return sum;
    }
}
