import math
class Solution:

	def checkTriplet(self,arr, n):
    	# code here
        arr.sort()
        for i in range(n):
            for j in range(i+1, n):
                if math.sqrt(arr[i]**2 + arr[j]**2) in arr[j:]:
                    return True
        return False
