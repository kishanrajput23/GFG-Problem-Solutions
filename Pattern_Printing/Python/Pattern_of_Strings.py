class Solution:
	def pattern(self, S):
		# code here
		i = len(S)
        ans = []
        while i>=1:
            ans.append(S[:i])
            i-= 1
        return ans
