class Solution { 
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2) {
        // Your code goes here
        Arrays.sort(A);
        long sum = 0;
        for (int i=(int)K1; i<(int)K2-1; i++) {
            sum+=A[i];
        }
        return sum;
    }
}
