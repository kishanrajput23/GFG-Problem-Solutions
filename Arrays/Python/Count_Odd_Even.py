class Solution:
	def countOddEven(self, arr, n):
		#Code here
		even = 0
		odd = 0
		for i in arr:
		    if i%2==0:
		        even += 1
		    else:
		        odd += 1
		print(odd, even)
