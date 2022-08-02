class Solution:
	def numOfsubarrays(self,arr, n):
    	# code here
    	summ = 0 
    	pr = 1
        k = n
        for i in range(n):
            summ = arr[i]
            pr = arr[i]
            for j in range(i+1, n):
                summ += arr[j]
                pr *= arr[j]
                if summ == pr:
                    k += 1
                    break
        return k
