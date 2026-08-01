class Solution:
    #Back-end complete function Template for Python 3  
    #Function to find the leaders in the array.
    def leaders(self, A, N):
        #Code here
        Max = 0
        leaders = []
        for item in reversed(A):
            if item >= Max:
                leaders.append(item)
                Max = item
        return reversed(leaders)
