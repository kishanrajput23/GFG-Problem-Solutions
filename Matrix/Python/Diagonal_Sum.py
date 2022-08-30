class Solution:
	def DiagonalSum(self, matrix):
		# Code here
		summ = 0
        for i in range(len(matrix)):
            summ += matrix[i][i] + matrix[i][len(matrix)-1-i]
        return summ
