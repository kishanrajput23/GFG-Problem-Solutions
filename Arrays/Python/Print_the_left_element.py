class Solution:
    def leftElement(self, arr, n):
        # Your code goes here
        arr.sort()
        if n%2 == 0:
            return arr[int(n/2)-1]

        else:
            return arr[int(n/2)]
