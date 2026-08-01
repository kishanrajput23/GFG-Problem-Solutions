class Solution:
    def minDiff(self,a,N,K):
        a.sort()
        ans = a[-1]
        for i in range(0, N-K+1):
            mini = a[i]
            maxi = a[i+K-1]
            d = maxi - mini
            if ans > d:
                ans = d
        return ans
