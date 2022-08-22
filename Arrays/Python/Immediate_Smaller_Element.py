class Solution:

	def immediateSmaller(self,arr,n):
		# code here
		for i in range(n-1):
            if arr[i] > arr[i+1]:
                arr[i] = arr[i+1]
            else:
                arr[i] = -1
        arr[n-1] = -1
