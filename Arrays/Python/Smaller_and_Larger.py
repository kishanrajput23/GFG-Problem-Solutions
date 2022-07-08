class Solution:

	def getMoreAndLess(self,arr, n, x):
		# code here
		less, greater = 0, 0
		for i in arr:
		    if i <= x:
		        less += 1
		    if i >= x:
		        greater += 1
        return less, greater
