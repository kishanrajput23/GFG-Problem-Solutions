class Solution:

    def printTriangle(self, N):

        c=65

        for i in range(N):

            for j in range(65,65+i+1):

                print(chr(j),end="")

            print()
