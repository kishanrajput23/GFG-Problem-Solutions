class Solution:
	def balancedNumber(self, N):
		# your code here
		s=str(N)
        middle=(len(s)//2)
        c=0
        d=0
        for i in range(0,middle):
            c+=int(s[i])
        for j in range(middle+1,len(s)):
            d+=int(s[j])
   
        if c==d:
            return 1
        else:
            return 0
