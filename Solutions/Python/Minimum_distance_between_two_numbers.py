class Solution:
    def minDist(self, arr, n, x, y):
        st = -1 
        ed = -1
        md = n 
        for i in range(n):
            if arr[i] == x: 
                st = i
            if arr[i] == y: 
                ed = i
            if st != -1 and ed != -1:
                md = min(md, abs(ed-st))
        if st==-1 or ed==-1:
            return -1
        return md
    
