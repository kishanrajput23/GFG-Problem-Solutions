class Solution {
    void leftRotate(int[] arr, int n, int d) {
        // code here
        int temp[] = new int[n];
        for (int i=0; i<d; i++) {
            temp[n-d+i] = arr[i];
        }
        for (int i=d; i<n; i++) {
            temp[i-d]=arr[i];
        }
        for (int i=0; i<n; i++) {
            arr[i]=temp[i];
        }
    }
}
