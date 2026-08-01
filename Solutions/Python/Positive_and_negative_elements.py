class Solution:
    def arranged(self,a,n):
        #Code here
        pos = []
        neg = []
        arr = []
        for i in range(n):
            if a[i] >= 0:
                pos.append(a[i])
            else:
               neg.append(a[i])
        for i in range(n//2):
            arr.append(pos[i])
            arr.append(neg[i])
        return arr
