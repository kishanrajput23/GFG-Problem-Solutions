class Solution:
    def firstRep(self, s):
        # code here
        for i in s:
            if s.count(i) > 1:
                return i
        return -1
