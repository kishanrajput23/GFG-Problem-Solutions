class Solution:
    def sumXOR (self, arr, n) : 
        #Complete the function
        summ = 0
        for i in range(n):
            for j in range(i+1, n):
                summ += (arr[i]^arr[j])
        return summ
