class Solution:
    def duplicates(self, arr, n):
        # code here
        ans = [] 
        arr = sorted(arr)
        for i in range(len(arr)-1):
            if arr[i] == arr[i+1]:
                ans.append(arr[i])
        if ans:
            return sorted(list(set(ans)))
        else:
            return [-1]
