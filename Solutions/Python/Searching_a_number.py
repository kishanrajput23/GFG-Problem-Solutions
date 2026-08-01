class Solution:

	
	def search(self,arr, n, k): 
    	# code here
    	if k in arr:
    	    return arr.index(k) + 1
    	return -1
