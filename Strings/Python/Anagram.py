class Solution:
    #Function is to check whether two strings are anagram of each other or not.
    def isAnagram(self,a,b):
        #code here
        return True if sorted(a) == sorted(b) else False
