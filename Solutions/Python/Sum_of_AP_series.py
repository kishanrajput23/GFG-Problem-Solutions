class Solution:
	def sum_of_ap(self, n, a, d):
		# Code here
        ans = n * (2 * a + (n-1) * d) // 2
        return ans
