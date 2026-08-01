class Solution:
    def findPairs(self, arr, n): 
        #code here.  
        hs = {}
        for i in range(n-1):
            for j in range(i+1,n):
                s = arr[i] + arr[j]
                if s in hs:
                    return 1
                else:
                    hs[s] = [arr[i], arr[j]]
        return 0
