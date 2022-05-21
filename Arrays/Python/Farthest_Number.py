class Solution:
    def farNumber(self,N,Arr):
        #code here
        lst = [-1]*N
        for i in range(N):
            for j in range(N-1, i, -1):
                if Arr[j] < Arr[i]:
                    lst[i]=j
                    break
        return lst
