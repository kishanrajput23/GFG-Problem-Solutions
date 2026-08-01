import bisect
class Solution:
   def countEleLessThanOrEqual(self,arr1,n1,arr2,n2):
        #returns the required output
        arr2.sort()
        res =  []
        for i in arr1:
            res.append(bisect.bisect_right(arr2,i))
        return res
