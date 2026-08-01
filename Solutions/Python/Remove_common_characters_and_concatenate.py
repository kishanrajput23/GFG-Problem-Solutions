class Solution:
    #Function to remove common characters and concatenate two strings.
    def concatenatedString(self,s1,s2):
        #code here
        str1 = ""
        for i in s1:
            if i not in s2:
                str1 += i
        for i in s2:
            if i not in s1:
                str1 += i
        if len(str1) == 0:
            return -1
        return str1
