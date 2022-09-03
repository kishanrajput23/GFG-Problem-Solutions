class Solution:
    def nPr(self, n, r):
        # code here
        def findFactorial(n):
            fact = 1
            for i in range(1, n+1):
                fact = fact*i
            return fact
        return findFactorial(n) // findFactorial(n-r)
