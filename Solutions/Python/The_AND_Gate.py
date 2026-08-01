class Solution:
    def andGate (self, arr, N):
        # code here
        count = 1
        for i in range(N):
            count = count & arr[i]
        return count
