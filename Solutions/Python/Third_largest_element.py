class Solution:
    def thirdLargest(self,a, n):
        # code here
        a.sort()
        if n <= 2:
            return -1
        else:
            return a[-3]
