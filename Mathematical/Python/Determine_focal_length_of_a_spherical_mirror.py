import math

class Solution:
	def findFocalLength(self, R, type):
		# Code here
		if type == "concave":
		    return math.floor(R/2)
		if type == "convex":
		    return math.floor(-R/2)
