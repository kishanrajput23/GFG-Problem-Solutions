class Solution{
	int sumDiagonal(int N, int [][] M) {
		//Write your code here
		int primSum = 0;
        for(int i = 0; i < M.length; i++) { 
            primSum += M[i][i];
        }
        return primSum;
	}
}
