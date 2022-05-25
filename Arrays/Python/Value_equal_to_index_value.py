class Solution:

	def valueEqualToIndex(self,arr, n):
		# code here
		ls = []
		for i in range(n):
		    if i+1 == arr[i]:
		        ls.append(i+1)
		return ls
