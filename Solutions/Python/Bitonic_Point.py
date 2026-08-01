class Solution:

	def findMaximum(self,arr, n):
		# code here
		maxi = 0
        for i in range(n):
            if maxi < arr[i]:
                maxi = arr[i]
        return maxi
