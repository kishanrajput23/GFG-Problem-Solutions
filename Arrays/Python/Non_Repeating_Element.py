class Solution:
    def firstNonRepeating(self, arr, n): 
        # Complete the function
        mp = {}
        for i in arr:
            if i in mp:
                mp[i] += 1
            else:
                mp[i] = 1
        for i in arr:
           if mp[i] == 1:
               return i
        return 0
