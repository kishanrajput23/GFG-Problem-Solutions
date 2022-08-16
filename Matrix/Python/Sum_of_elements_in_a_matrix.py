class Solution:
    def sumOfMatrix(self,N,M,Grid):
        #code here
        ans=0
        for i in range(N):
            for j in range(M):
                ans += Grid[i][j]
        return ans
