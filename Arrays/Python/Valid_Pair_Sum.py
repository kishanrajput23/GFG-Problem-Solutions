class Solution:
    def ValidPair(self, a, n): 
    	# Your code goes here
    	a.sort(reverse = True) # sort array
        low, high = 0, n-1
        count = 0
        while low <= high:
            msum = a[low] + a[high]
            if msum <= 0:
                high -= 1
            else:
                count += high -low
                low += 1
        return count
