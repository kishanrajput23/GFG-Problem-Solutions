class Solution:
    def segregateElements(self, arr, n):
        # Your code goes here
        l2=[]
        l3=[]
        for i in arr:
            if i>0:
                l2.append(i)
            if i<0:
                l3.append(i)
        arr.clear()
        l2.extend(l3)
        arr.extend(l2)
        return arr
