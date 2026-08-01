class Solution {
    
    public long printMinimumProduct(long arr[], long n)
    {
        Arrays.sort(arr);
        long ans = arr[0]*arr[1];
        return ans;
    }
}
