class Solution:
	def sum_of_gp(self, n, a, r):
		# Code here
		if r == 1:
            return int(n*a)
        else:
            return int(a*((r**n) - 1) / (r - 1))
