class Solution:
    def sumBetweenTwoKth(self, A, N, K1, K2):
        # Your code goes here
        A.sort()
        return sum(A[K1:K2-1])
