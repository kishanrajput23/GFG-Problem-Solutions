class Solution:
    def xorGate (self, arr, N):
        #code here
        xor = arr[0]
        for i in range(1, N):
            xor = xor ^ arr[i]
        return xor
