class Solution:
    #Complete this function
    # Function to find the maximum index difference.
    def maxIndexDiff(self,A, N): 
        ##Your code here
        low = 0
        high = N-1
        maxi = -1
        while low <= high:
            if A[low] <= A[high]: 
                maxi = max(maxi, high-low)
                high = N-1
                low += 1
            else:
                high -= 1
        return maxi
