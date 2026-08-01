class Solution:
	def printString(self, S, ch, count):
		# code here
		if count == 0:
            return S

        init = 0
        for i in range(len(S)):
            if S[i]==ch:
                init+=1

            if init==count and i < len(S) - 1:
                return S[i+1:]
        return "Empty string"
