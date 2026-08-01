class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
        // Your code Here
        int k = n-1, sum = 0, j = 0;
        Arrays.sort(A);
        for (int i=0; i<n-2; i++) {
            k = n-1; j = i+1;
            while (j<k) {
                sum = A[i] + A[j] + A[k];
                if (sum==X) {
                    return true;
                }
                else if (sum>X) {
                    k--;
                }
                else {
                    j++;
                }
            }
        }
        return false;
    }
}
