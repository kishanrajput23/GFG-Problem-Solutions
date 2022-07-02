class Solution:
    def kthElement(self,  arr1, arr2, n, m, k):
        a = arr1 + arr2
        a.sort()
        return a[k-1]
