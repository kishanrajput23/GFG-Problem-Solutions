class Solution:
	def getXor(self, A, N):
		# code here
		xor=0
        for i in A:
            xor^=i
        return [int(x)^xor for x in A]
