class Solution:
    def printTriangle(self, N):
        # Code here
        for i in range(1, N+1):
            for j in range(1, i+1):
                print('* ', end="")
            print()
