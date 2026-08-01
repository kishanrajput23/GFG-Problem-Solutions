class Solution:
	def countSubarray(self,arr, n, k):
	    # code here
	    res,cur=0,0
	    for i in range(n):
	        if arr[i]<=k:
	            cur+=1
	            res+=cur
	        else:
	            cur=0
	    return n*(n+1)//2-res
