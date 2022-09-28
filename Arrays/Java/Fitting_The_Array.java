class Solution{
    // Function for finding maximum and value pair
    public static boolean isFit (int arr[], int brr[], int n) {
        //Complete the function
        Arrays.sort(arr);
        Arrays.sort(brr);
        boolean ans = true;
        for(int i=0; i<n; i++) {
            if (arr[i] <= brr[i]) {
                continue;
            }
            else {
                ans = false;
                break;
            }
        }
        return ans;
    }
}
