class Solution:
    
    #Function to find the smallest positive number missing from the array.
    def missingNumber(self,arr,n):
        #Your code here
        arr.sort()
        s=1
        for i in range(0,len(arr)):
            if s==arr[i]:
                s+=1
        return s
