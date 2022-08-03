class Solution:
    def findMinSum(self, A,B,N):
        A.sort()
        B.sort()
        summ = 0
        for i in range(N):
            summ += abs(A[i] - B[i])
        return summ
