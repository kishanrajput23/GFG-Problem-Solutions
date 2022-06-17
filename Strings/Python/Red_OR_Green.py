class Solution:
    def RedOrGreen(self,N,S):
        #code here
        c = 0 
        c1 = 0 
        for i in S :
            if i == 'R':
                c += 1 
            else:
                c1 += 1
        return min(c , c1)
