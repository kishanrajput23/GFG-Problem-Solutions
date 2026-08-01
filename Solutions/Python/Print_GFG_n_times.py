class Solution:
    def printGfg(self, n):
        # Code here
        if n==0:
            return 1
        print("GFG",end=' ')
        return (ob.printGfg(n-1))
