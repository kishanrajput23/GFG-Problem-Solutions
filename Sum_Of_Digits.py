class Solution:
    def sumOfDigits (self, N):
        # code here
        sum = 0
        for i in str(N):
            sum += int(i)
        return sum
