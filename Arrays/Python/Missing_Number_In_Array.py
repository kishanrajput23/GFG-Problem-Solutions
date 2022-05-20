class Solution:
    def MissingNumber(self,array,n):
        # code here
        res = (n*(n+1)) // 2
        rem = sum(array)
        return res - rem
