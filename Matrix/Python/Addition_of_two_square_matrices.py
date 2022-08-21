class Solution:
	def Addition(self, matrixA, matrixB):
		# Code here
		for i in range(len(matrixA)):
            
            for j in range(len(matrixA[i])):
                
                matrixA[i][j] = matrixA[i][j] + matrixB[i][j]
