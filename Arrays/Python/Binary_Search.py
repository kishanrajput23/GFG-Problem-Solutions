class Solution:	
	def binarysearch(self, arr, n, k):
		# code here
		low=0
        high=n-1
        while low<=high:
            mid = (low + high)//2
            if arr[mid]==k:
                return mid
                
            if k<arr[mid]:
                high=mid-1
                
            if arr[mid]<k:
                low=mid+1
            
        return -1;
