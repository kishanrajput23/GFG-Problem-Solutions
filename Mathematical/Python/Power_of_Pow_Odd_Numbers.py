class Solution:
	def sum_of_square_oddNumbers(self, n):
		# Code here
		num = 1 
		summ = 0
        for i in range(1,n+1):
            summ += num*num
            num += 2
        return summ
