class Compute {
    
    public static int missingNumber(int A[], int N)
    {
         // Your code goes here
        int sum = (N*(N+1))/2;
        for (int i=0; i<N; i++) {
            sum = sum - A[i];
        }
        return sum;
    }
}
