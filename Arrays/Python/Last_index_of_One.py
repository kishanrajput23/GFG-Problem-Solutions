class Solution:
    def lastIndex(self, s):
        # code 
        count = -1
        for i in range(len(s)):
            if s[i]=='1':
                count = i
        return count
