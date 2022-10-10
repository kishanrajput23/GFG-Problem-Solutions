class Solution:
    def printTriangle(self, N):
        # Code here
        for i in range(N):

            for j in range(N,i,-1):

                print('*', end=' ')

            print()
