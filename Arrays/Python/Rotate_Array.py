class Solution:
    #Function to rotate an array by d elements in counter-clockwise direction. 
    def rotateArr(self,A,D,N):
        #Your code here
        D%=N
        a1 = A[:D]
        a2 = A[D:]
        A[:] = a2+a1
        return A
