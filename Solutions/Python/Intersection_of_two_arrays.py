class Solution:
    def NumberofElementsInIntersection(self,a, b, n, m):
        #return: expected length of the intersection array.
        
        #code here
        a = set(a)
        b = set(b)
        a.intersection_update(b)
        c = len(list(a))
        return c
