class Solution {
    boolean checkIsAP(int arr[] ,int n)
    {
        // code here
        Arrays.sort(arr);
        int p =(arr[0]-arr[1]);
        for (int i=1; i<n-1; i++) {
            if (p!=(arr[i]-arr[i+1])) {
                return false;
            }
        }
    return true;
    }
}
