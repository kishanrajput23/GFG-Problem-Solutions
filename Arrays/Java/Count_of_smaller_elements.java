class Compute {
    public long countOfElements(long arr[], long n, long x)
    {
        int cnt = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] <= x) {
            cnt += 1;
            }
        }
        return cnt;
        
    }
}
