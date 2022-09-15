class Solution
{
    public int find(int[] A, int[] B)
    {
        // code here
        int AB = A[0]*B[0] + A[1]*B[1] + A[2]*B[2];
        int AxB = (int) (Math.pow((A[1]*B[2] - A[2]*B[1]),2) + Math.pow((A[0]*B[2] - B[0]*A[2]),2) + Math.pow((A[0]*B[1] - A[1]*B[0]),2));
        if (AxB==0) {
            return 1;
        }
        else if (AB==0) {
           return 2;
        }
        else {
            return 0;
        }
    }
}
