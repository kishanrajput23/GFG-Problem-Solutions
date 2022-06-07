class Solution:
    
    def checkIsAP(self, arr, n):
        # code here
        arr.sort()
        p = arr[0]-arr[1]
        for i in range(n-1):
            if p != arr[i]-arr[i+1]:
                return False
        return True
