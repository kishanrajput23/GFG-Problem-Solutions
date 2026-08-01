class Solution:
	def firstAlphabet(self, S):
		# code here
		S = S.split(" ")
		k = ""
		for i in range(len(S)):
		    k += S[i][0]
		return k
