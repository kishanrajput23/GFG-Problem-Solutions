class Solution
{
    public int find_median(int[] v)
    {
        // Code here
        Arrays.sort(v);
        int n = v.length;
        int start = 0;
        int mid = start + (n-start)/2;
        if (n%2==0) {
            int avg = (int) (v[mid] + v[mid-1])/2;
            return avg;
        }
        return v[mid];
    }
}
