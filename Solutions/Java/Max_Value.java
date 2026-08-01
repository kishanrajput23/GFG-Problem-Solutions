class Solution {

    public static int maxVal(int a[], int n) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<n; i++) {
            if ((a[i]-i)>max) {
                max = a[i] - i;
            }
            if ((a[i]-i)<min) {
                min = a[i] - i;
            }
        }
        return max - min;
    }
}
