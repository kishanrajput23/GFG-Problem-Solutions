class Solution:
    # Complete this function
    
    #Function to find equilibrium point in the array.
    def equilibriumPoint(self,A, N):
        # Your code here
        sum1 = 0
        leftsum = 0
        for i in range(0,N):
            sum1 += A[i]
        for i in range(0,N):
            sum1 -= A[i]
            if leftsum == sum1:
                return i+1
            leftsum += A[i]
        return -1
