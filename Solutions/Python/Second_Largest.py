class Solution:

	def print2largest(self,arr, n):
		# code here
		arr = list(set(arr))
        if len(arr)==1:
            return -1
        else:
            return sorted(arr)[-2]
