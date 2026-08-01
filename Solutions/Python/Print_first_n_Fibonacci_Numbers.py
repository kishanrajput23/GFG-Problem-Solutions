class Solution:
    #Function to return list containing first n fibonacci numbers.
    def printFibb(self,n):
        # your code here
        ans=[None]*n
        if n>=1:
            ans[0]=1
        if n>=2:
            ans[1]=1
        for i in range(2,n):
            ans[i]=ans[i-1]+ans[i-2]
        return ans
