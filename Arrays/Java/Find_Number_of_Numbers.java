class GfG {
    public static int num(int a[], int n, int k) {
        int count = 0;
        for (int i=0; i<n; i++) {
            int num = a[i];
            while (num > 0) {
                if (num % 10 == k) {
                    count += 1;
                }
                num /= 10;
            }
        }
        return count;
    }
}
