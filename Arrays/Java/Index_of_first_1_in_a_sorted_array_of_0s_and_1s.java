class Solution {
    
    public long firstIndex(long arr[], long n)
    {
        // Your code goes here
        int index=-1;
        for (int i=0; i<n; i++) {
            if (arr[i] == 1) {
                index = i;
                break;
            }
        }
        return (long) index;
    }
}
