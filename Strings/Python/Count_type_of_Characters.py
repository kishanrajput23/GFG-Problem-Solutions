class Solution:
    def count (self,s):
        # your code here
        count = [0, 0, 0, 0]
        for i in s:
            if i.isupper():
                count[0] += 1
            elif i.islower():
                count[1] += 1
            elif i.isdigit():
                count[2] += 1
            else:
                count[3] += 1
        return count
