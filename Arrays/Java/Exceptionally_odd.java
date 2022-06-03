class Solution {
    int getOddOccurrence(int[] arr, int n) {
        // code here
        int xor = 0;
        for (int i : arr) {
            xor = xor ^ i;
        }
        return xor;
    }
}
