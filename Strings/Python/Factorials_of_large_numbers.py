class Solution:
    def factorial(self, N):
        #code here
        fact = 1
        for i in range(N,0,-1):
            fact = fact * i
        return str(fact)
