class Complete{
    // Function for finding maximum and value pair
    public static int multiply (int arr[], int n) {
        //Complete the function
        int ls = 0;
        int rs = 0;
        
        for (int i=0; i<n; i++) {
            if (i < n/2) {
                ls += arr[i];
            }
            else {
                rs += arr[i];
            }
        }
        return ls * rs;
    }
}
