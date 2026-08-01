class Solution:
	def streamAvg(self, arr, n):
		# code here
		l=[]
        sum=0
        for i in range(0,len(arr)):
            for j in range(i,i+1):
                sum=sum+arr[j]
                l.append(sum/(j+1))
        return l 
