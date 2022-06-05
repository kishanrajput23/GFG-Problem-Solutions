class Solution:
    def check_elements(self, arr, n, A, B):
        # Your code goes here
        flag = True
        for i in range(A, B+1):
            if i not in arr:
                flag = False
        return flag
