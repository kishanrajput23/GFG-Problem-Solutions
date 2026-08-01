class Solution:
     
    #Function to find if there exists a triplet in the 
    #array A[] which sums up to X.
    def find3Numbers(self,A, n, X):
        # Your Code Here
        k = n-1
        summ = 0 
        j = 0
        A.sort()
        for i in range(n-2):
            k = n-1
            j = i+1
            while j<k:
                summ = A[i] + A[j] + A[k]
                if summ == X:
                    return True
                elif summ > X:
                    k -= 1
                else:
                    j += 1
        return False
