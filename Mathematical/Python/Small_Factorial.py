class Solution:
	def find_fact(self, n):
		# Code here
		if n == 0:
            return 1
        else:
            return(n*ob.find_fact(n-1))
