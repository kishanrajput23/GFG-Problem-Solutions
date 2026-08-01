class Solution:
	def removeCharacters(self, S):
		# code here
		a=[]
        for i in S:
            if (i == '0'or i == '1'or i == '2'or i == '3'or i == '4'or i == '5'or i == '6'or i == '7'or i == '8'or i == "9" ):
                a.append(i)
        return "".join(a)
