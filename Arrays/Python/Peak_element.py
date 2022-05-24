class Solution:   
    def peakElement(self,arr, n):
        # Code here
        if n==1:
            return 0
        else:
            for i in range(n):
                if i==0 and  arr[i]>arr[i+1]:
                    return i
                elif i==n-1 and arr[i]>arr[i-1]:
                    return i
                elif arr[i]>arr[i-1] and arr[i]>arr[i+1]:
                    return i
