class Compute
{
    String average(int A[], int N)
    {
        float av = 0;
        for(int i = 0; i < N; i++) {
            av += A[i];
        }
        return String.format("%.2f", av/N);
    }
}
