class Solution:
    def findIndex (self,a, N, key ):
        #code here.
        d=[]
        for i in range(N):
            if a[i]==key:
                d.append(i)
            else:
                pass
        if len(d)!=0:
            return d[0],d[-1]
        else:
            return -1,-1
