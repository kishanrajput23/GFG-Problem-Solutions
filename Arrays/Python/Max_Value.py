class Solution:
    def maxVal(self, a, n):
        #Code Here
        maxi = a[0]
        mini = a[0]
        for i in range(n):
            if (a[i]-i)>maxi:
                maxi = a[i] - i
            if (a[i]-i)<mini:
                mini = a[i] - i
        return maxi - mini
