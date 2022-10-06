class Solution:
    def printNos(self, n):
        # Code here
        if n==0:
            return 1
        print(n, end=' ')
        return(ob.printNos(n-1))
