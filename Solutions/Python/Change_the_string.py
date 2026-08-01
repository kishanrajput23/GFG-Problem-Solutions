class Solution:
    def modify(self, s):
        # code here
        if s[0].islower():
            return s.lower()
        else:
            return s.upper()
