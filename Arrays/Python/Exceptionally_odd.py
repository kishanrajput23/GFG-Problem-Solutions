class Solution:
    def getOddOccurrence(self, arr, n):
        # code here 
        xor = 0
        for i in arr:
            xor = xor ^ i
        return xor
