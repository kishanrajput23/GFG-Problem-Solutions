class Solution:
    def findSingle(self, N, arr):
        # code here
        ans = 0
        for i in range(N):
            ans ^= arr[i]
        return ans
