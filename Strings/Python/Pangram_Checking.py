class Solution:
    
    #Function to check if a string is Pangram or not.
    def checkPangram(self,s):
        #code here
        List = [False]*26
        for c in s.lower():
            if c.isalpha():
                List[ord(c)-ord('a')]= True
        for ch in List:
            if ch == False:
                return False
        return True
