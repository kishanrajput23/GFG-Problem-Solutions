class Solution: 
    def firstAndLast(self, arr, n, x): 
        # Code here
        ls = []
        if x not in arr:
            ls.append(-1)
            
        for i in range(n):
            if arr[i] == x:
                ls.append(i)
                break
    
        for i in range(n-1, -1, -1):
            if arr[i] == x:
                ls.append(i)
                break
        
        return ls 
