class Solution:
	def countTriplets(self, nums):
		# Code here
		count=0
	    for i in range(1,len(nums)):
	        left,right=0,0
	        for j in range(i-1,-1,-1):
	            if nums[j]<nums[i]:
	                left+=1
	        for j in range(i+1,len(nums)):
	            if nums[j]>nums[i]:
	                right+=1
	        count+=(left*right)
	    return count
