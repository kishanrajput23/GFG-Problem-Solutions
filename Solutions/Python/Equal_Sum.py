class Solution:

	def equilibrium(self,arr, n): 
    	# code here
    	s = 0
    	leftsum = 0
        for i in range(n):
            s += arr[i]
            
        for j in range(n):
            if s-leftsum-arr[j] == leftsum:
                return "YES"
            leftsum += arr[j]
        
        return "NO"
