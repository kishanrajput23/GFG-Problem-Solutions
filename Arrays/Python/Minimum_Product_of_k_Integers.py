class Solution:
    def minProduct(self, a, n, k): 
        # Complete the function
        a.sort()
        prod = 1
        for i in range(k):
            prod *= a[i]
        return prod % 1000000007
