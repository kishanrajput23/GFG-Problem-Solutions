class Solution:
    def leftRotate(self, arr, n, d):
        # code here
        arr[:] = arr[d:] + arr[:d]
        return arr
