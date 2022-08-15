/*Complete the function below*/
class GfG { 
    public static void multiply(int A[][], int B[][], int C[][], int N) {
        //add code here.
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                C[i][j] = 0;
                for (int k=0; k<N; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }
}
