import collections
class Solution:
	def maxRepeating(self,arr, n, k):
	    # code here
	    arr.sort()
	    d = collections.Counter(arr)
	    e = max(d.values())
	    for i in d.keys():
	        if d[i]==e:
	            return i
