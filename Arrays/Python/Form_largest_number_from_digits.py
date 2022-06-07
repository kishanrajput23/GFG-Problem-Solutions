class Solution:
    def MaxNumber(self, arr, n):
        #code here.
        arr.sort()
        k = "".join(map(str, arr))
        return k[::-1]
