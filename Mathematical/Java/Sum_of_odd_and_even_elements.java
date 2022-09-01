class Solution
{
    public int[] find_sum(int n)
    {
        // Code here
        int arr[] = {0,0};
        for (int i=1; i<=n; i++) {
            if (i%2==0) {
                arr[1] += i;
            }
            else {
                arr[0] += i;
            }
        }
        return arr;
    }
}
