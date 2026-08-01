class Solution:
    def triDownwards(self, S):
        # code here
        res = ""
        n = len(S)
        for i in range(n):
            for j in range(n):
                if j >= i:
                    res += S[j] 
                else:
                    res += '.'
        return res;
