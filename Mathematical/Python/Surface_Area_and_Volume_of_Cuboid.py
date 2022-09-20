class Solution:
	def find(self, l, b, h):
		# Code here
		return [2*((l*b) + (b*h) + (h*l)), l*b*h]
