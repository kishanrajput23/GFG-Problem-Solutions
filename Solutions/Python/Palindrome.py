class Solution:
	def is_palindrome(self, n):
		# Code here
		if str(n) == str(n)[::-1]:
		    return "Yes"
    return "No"
