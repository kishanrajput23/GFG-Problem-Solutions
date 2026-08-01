class Solution:
	def pushZerosToEnd(self,arr, n):
    	# code here
    	count=0
        for k in range(n):
            if(arr[k]==0):
                count+=1
            else:
                arr[k-count], arr[k] = arr[k], arr[k-count]
        return arr
