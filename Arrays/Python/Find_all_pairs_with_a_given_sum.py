class Solution:
    def allPairs(self, A, B, N, M, X):
        # Your code goes here 
        A.sort()
        res=[]
        for i in range(N):
            if X-A[i] in B:
                res.append([A[i], X-A[i]])
        return res 
