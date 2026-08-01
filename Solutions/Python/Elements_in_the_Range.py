class Solution:
    def check_elements(self, arr, n, A, B):
        # Your code goes here
        count=0
        for i in range(A,B+1):
            if i in arr:
                count=1
            else:
                count=0
                break
        if count==1:
            return True
        else:
            return False
