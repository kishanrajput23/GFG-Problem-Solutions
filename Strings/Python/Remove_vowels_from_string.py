class Solution:
	def removeVowels(self, S):
		# code here
		st=''
        for i in S:
            if i.lower()=='a' or i.lower()=='e' or i.lower()=='i' or i.lower()=='o' or i.lower()=='u':
                continue
            else:
                st+=i
        return st 
      
