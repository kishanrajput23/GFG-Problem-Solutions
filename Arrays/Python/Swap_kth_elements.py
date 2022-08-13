class Solution:
	def swapKth(self,arr, n, k):
		# code here
		arr[k-1], arr[-k] = arr[-k], arr[k-1]
		return arr
