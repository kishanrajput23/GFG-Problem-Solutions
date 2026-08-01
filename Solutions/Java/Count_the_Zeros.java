class Solution {
    int countZeroes(int[] arr, int n) {
        // code here
        int count=0;
        for (int i=0; i<n; i++) {
            if (arr[i]==0) {
                count += 1;
            }
        }
        return count;
    }
}
