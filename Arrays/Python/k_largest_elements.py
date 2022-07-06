class Solution:
	def kLargest(self,arr, n, k):
		# code here
		ls = []
		arr.sort()
		a = arr[::-1]
		for i in range(k):
		    ls.append(a[i])
		return ls
