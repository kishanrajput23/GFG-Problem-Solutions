class Solution:
    def isProduct(self, arr, n, x):
        # code here
        dict1 = dict(zip(arr, [0]*n))
        for i in range(n):
            if arr[i]!=0:
                if x/arr[i] in dict1:
                    return 1
        return 0
