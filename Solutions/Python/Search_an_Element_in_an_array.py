class Solution:
    #Complete the below function
    def search(self,arr, N, X):
        #Your code here
        for i in range(N):
            if arr[i] == X:
                return i
        return -1
