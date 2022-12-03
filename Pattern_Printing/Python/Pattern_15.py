class Solution:

    def printTriangle(self, N):

        c=65

        for i in range(N, 0, -1):

            for j in range(65,65+i):

                print(chr(j),end="")

            print()
