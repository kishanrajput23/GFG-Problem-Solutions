class Solution:
    def is_common(self, s, t):
        # Code here
        for i in s :
            if i in t :
                return "CHANGE"
        return "BEHAPPY"
