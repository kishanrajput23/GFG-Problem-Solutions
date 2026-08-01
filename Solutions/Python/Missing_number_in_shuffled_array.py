class Solution:
    def findMissing(self,  a, b, n):
        # code here
        num = a[n-1];
        for i in range(n-1):
            num ^= a[i] ^ b[i]
        return num
