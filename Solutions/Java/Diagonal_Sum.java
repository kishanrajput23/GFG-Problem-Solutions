class Solution
{
    public int DiagonalSum(int[][] matrix)
    {
        // code here
        int sum=0;
        for (int i=0; i<matrix.length; i++) {
            sum=sum+matrix[i][i]+matrix[i][matrix.length-1-i];
        }  
        return sum;
    }
}
