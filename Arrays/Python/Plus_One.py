class Solution:
    def increment(self, arr, N):
        # code here 
        str1=""
        if arr[-1]!=9:
            arr[-1]=arr[-1]+1
            return arr
        else:
            for i in arr:
                str1+=str(i)
            res = int(str1) + 1
            return str(res)
