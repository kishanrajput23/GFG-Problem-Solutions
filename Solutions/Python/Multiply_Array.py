class Solution:
    def longest(self, arr, n):
        #Code Here
        summ = 1
        for i in range(n):
            summ *= arr[i]
        return summ
