class Solution:
    def nthTermOfAP(self,A1,A2,N):
        #code here
        return A2 + (N-2)*(A2-A1)
