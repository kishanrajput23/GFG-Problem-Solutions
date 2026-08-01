class Solution:
    def countCamelCase (self,s):
        # your code here
        res = 0
        for i in s:
            if i.isupper():
                res += 1
        return res
