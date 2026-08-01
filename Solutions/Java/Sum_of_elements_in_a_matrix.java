class Solution {
    int sumOfMatrix(int N, int M, int[][] Grid) {
        // code here
        int ans=0;
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                ans += Grid[i][j];
            }
        }
        return ans;
    }
}
