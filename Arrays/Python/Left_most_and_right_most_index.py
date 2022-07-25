class Solution:
    def indexes(self, v, x):
        # Your code goes here
        start=-1
        end=-1
        n=len(v)
        for i in range(n):
            if v[i]==x:
                start=i
                break
        for i in range(n-1, -1, -1):
            if v[i] == x:
                end=i
                break
        return [start,end]
