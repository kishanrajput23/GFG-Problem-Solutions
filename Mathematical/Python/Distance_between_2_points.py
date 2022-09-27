import math

class Solution:
	def distance(self, x1, y1, x2, y2):
		# Code here
		x = (x2-x1) ** 2
		y = (y2-y1) ** 2
		return round(math.sqrt(x+y))
