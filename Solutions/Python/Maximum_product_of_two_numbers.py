class Solution:

	def maxProduct(self,arr, n):
		# code here
		arr.sort()
		return arr[n - 1]*arr[n - 2]
