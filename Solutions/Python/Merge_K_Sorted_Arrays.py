class Solution:
    #Function to merge k sorted arrays.
    def mergeKArrays(self, arr, K):
        # code here
        # return merged list
        a = []
        for i in arr:
            a.extend(i)
        a.sort()
        return a
