class Solution:
    def findDuplicate(self, arr, N, K):
        ls = []
        for i in set(arr):
            if arr.count(i) == K:
                ls.append(i)
        return min(ls)
