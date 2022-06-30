class Solution:
    def klengthpref(self,arr,n,k,s):
        # return list of words(str) found in the board
        count = 0
        s1 = s[:k]
        for i in range(n):
            s2 = arr[i]
            if s1 == s2[:k]:
                count +=1    
        return count
