class Solution:
	def convert(self,arr, n):
		# code here
		dct = {}
        a = sorted(arr)
        for i in range(len(a)):
            dct[a[i]] = i
        for i in range(n):
            arr[i] = dct[arr[i]]
        return arr
