class Solution:

	def findSum(self,a, b):
		# code here
		a1 = int("".join(map(str, a)))
		a2 = int("".join(map(str, b)))
		k = a1 + a2
		ls = []
		for i in str(k):
		    ls.append(int(i))
		return ls
