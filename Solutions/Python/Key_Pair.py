class Solution:
	def hasArrayTwoCandidates(self,arr, n, x):
		# code here
		hm = set()
        for i in arr:
            b = x - i
            if b in hm:
                return True
            else:
                hm.add(i)
        return False
