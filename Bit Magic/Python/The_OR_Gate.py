class Solution:
    def orGate (self, arr, N):
        # code here 
        count = 0
        for i in range(N):
            count = count | arr[i]
        return count
