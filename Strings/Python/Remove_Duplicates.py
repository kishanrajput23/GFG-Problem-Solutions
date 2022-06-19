class Solution:
	def removeDups(self, S):
		# code here
		string = ""
        for i in S:
            if i not in string:
                string += i
        return string
