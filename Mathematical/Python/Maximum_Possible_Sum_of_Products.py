class Solution:

    def MaxSum(self, A, B, N):
        # code here\
        A.sort()
        B.sort()
        sum = 0
        for i in range(N):
            sum += A[i] * B[i]
        return sum
