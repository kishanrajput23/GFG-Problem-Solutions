class Solution:
	def find_median(self, v):
		# Code here
		v.sort()
        n = len(v)
        start = 0
        mid = start + (n-start)//2
        if n % 2 == 0: 
            avg = int((v[mid] + v[mid-1])/2)
            return avg
        return v[mid]
