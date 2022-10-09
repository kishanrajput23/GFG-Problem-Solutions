class Solution:
    def printTriangle(self, N):
        # Code here
        for i in range(N, 0, -1):

            for j in range(1, i+1):

                print(j, end=' ')

            print()
