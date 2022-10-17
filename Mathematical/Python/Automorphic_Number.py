class Solution:
	def is_AutomorphicNumber(self, n):
		# Code here
		N = n*n
		ns = str(n)

        s = str(N)

        a = (s[-len(ns):])

        if int(a) == n:
            return 'Automorphic'
        else:
            return 'Not Automorphic'
