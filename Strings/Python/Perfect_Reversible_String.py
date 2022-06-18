class Solution:
    def isReversible(self, str, n):
        # code here
        if str == str[::-1]:
            return 1
        else:
            return 0
