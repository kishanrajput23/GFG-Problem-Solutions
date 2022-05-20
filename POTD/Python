class Solution:
    def findTime(self, S1, S2):
        # code here 
        store = {n:ind for ind,n in enumerate(S1)}
        total = 0
        curr = 0
        for i in S2:
            total += abs(curr - store[i])
            curr = store[i]
        return total
