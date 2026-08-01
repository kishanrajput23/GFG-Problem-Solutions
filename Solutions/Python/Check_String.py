class Solution:
    def check (self,s):
        # your code here
        s = set(s)
        return 0 if len(s) > 1 else 1
