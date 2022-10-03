class Solution:
    def printTriangle(self, N):
        # Code here
        for i in range(65, N+65):
            for j in range(64, i):
                print(chr(i), end="")
            print()
