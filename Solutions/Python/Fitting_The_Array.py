class Solution:
    def isFit (self,arr, brr, n) : 
        #Complete the function
        arr = sorted(arr)
        brr = sorted(brr)
        res = 0
        for i in range(n):
            if arr[i]<=brr[i]:
                res+=1
        if res==n:
            return True
        else:
            return False
