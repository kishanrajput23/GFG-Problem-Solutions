class Solution:
    def roundToNearest (self, N) : 
        #Complete the function
        k = int(N)
        r = int(k%10)
        if r>5:
            return (k-r+10)
        else:
            return (k-r)
