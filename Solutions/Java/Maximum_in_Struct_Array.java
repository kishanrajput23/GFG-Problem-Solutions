class GfG
{
    public static int findMax(Height arr[], int n) {
        // your code here
        int m = 0;
        for (int i=0; i<n; i++) {
            int sum = 0;
            sum += (arr[i].feet)*12 + arr[i].inches;
            m = Math.max(m,sum);
        }
        return m;
    }
}
