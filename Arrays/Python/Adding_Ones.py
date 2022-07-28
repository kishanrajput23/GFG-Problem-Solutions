class Solution:
    def update(self, a, n, updates, k):
        # Your code goes here
        for i in range(0,k):
            a[updates[i]-1] += 1
        
        for i in range(1, n):
            a[i] += a[i-1]
