class Solution:
    def reArrange(self, arr, N):
        # code here 
        i=0
        j=1
        while i<N and j<N:
            while i<N and arr[i]%2==0:
                i+=2
            while j<N and arr[j]%2!=0:
                j+=2
            if i<N and j<N:
                arr[i],arr[j]=arr[j],arr[i]
                i+=2
                j+=2
