class Solution:
    def UncommonChars(self,A, B):
        #code here
        char = list(set(A+B))
        char.sort()
        res = ''
        for i in char:
            if i not in A or i not in B:
                res+=i                
        return res if len(res)>=1 else '-1'
