class Solution:
    #Function to reverse words in a given string.
    def reverseWords(self,S):
        # code here 
        k = S.split(".")
        a = k[::-1]
        r = ".".join(a)
        return r
