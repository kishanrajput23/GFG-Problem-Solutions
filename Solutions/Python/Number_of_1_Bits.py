class Solution:
	def setBits(self, N):
		# code here
		count = 0
        while N > 0:
            if N%2 != 0:
                count += 1
            N = N//2
        return count
