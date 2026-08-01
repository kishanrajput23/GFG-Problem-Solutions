class Solution:
    def removeChars (ob, string1, string2):
        # code here 
        for i in string2:
            if i in string1:
                string1 = string1.replace(i, "")
        return string1
