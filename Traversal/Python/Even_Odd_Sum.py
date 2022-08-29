class Solution:
    def EvenOddSum(self,N,Arr):
        #code here (return list)
        oddSum = 0
        evenSum = 0
        for idx in range(N):
            if idx%2 != 0:
                oddSum += Arr[idx]
            else:
                evenSum += Arr[idx]
        return evenSum, oddSum
