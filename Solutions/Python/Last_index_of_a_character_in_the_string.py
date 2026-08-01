class Solution:
    def LastIndex(self, s, p):
        # code here
        for i in range(len(s)-1, -1, -1):
            if s[i] == p:
                return i
        return -1
