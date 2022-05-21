from collections import Counter
class Solution:
    def majorityElement(self, A, N):
        #Your code here
        nums1= Counter(A)
        for n in nums1.keys():
            if nums1[n] > (len(A)//2):
                return n
        return -1
