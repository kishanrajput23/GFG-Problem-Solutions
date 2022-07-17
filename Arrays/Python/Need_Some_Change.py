class Solution:
	def swapElements(self, arr, n):
		#Code here
		for i in range(n-2):
		    arr[i], arr[i+2] = arr[i+2], arr[i] 
