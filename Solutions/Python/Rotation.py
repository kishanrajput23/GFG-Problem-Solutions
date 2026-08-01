class Solution:
    def findKRotation(self,arr,  n):
        # code here
        k = sorted(arr)
        m = k[0]
        for i in range(n):
            if arr[i] == m:
                return i
