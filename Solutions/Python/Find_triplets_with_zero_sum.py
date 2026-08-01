class Solution:
    #Function to find triplets with zero sum.    
    def findTriplets(self, arr, n):
        #code here
        for i in range(n):
            for j in range(i+1, n):
                for k in range(j+1, n):
                    if arr[i] + arr[j] + arr[k] == 0:
                        return True
        return False
