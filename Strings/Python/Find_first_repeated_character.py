class Solution:
    def firstRepChar(self, s):
        # code here
        new = []
        new.append(s[0])
        for i in range(1, len(s)):
            if s[i] in new:
                return s[i]
                break
            else:
                new.append(s[i])
        else:
            return -1
