lass Solution:
    def printMinimumProduct(self, a, n):
        #Code here
        a.sort()
        ans = a[0] * a[1]
        return ans
