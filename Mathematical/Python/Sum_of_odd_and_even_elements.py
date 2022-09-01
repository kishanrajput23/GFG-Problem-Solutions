class Solution:
	def find_sum(self, n):
		# Code here
		sum = (n*(n+1))/2
        n = n//2
        even = ((2*n) + (n)*(n-1)) #sum of A.P. 2,4,6,....
        return [int(sum-even), int(even)]
