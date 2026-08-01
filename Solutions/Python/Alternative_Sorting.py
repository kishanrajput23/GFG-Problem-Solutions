class Solution:
    def alternateSort(self,arr, N):
        # Your code goes here
        arr.sort()

        l=[]

        i=0

        j=N-1

        while i<j:

            l.append(arr[j])

            j-=1

            l.append(arr[i])

            i+=1

        if N%2!=0:

            l.append(arr[i])
        return l
