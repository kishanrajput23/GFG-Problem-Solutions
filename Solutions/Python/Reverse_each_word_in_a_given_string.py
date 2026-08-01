class Solution:
    def reverseWords(self, s):
        # code here
        k = s.split(".")
        ls = []
        for i in k:
            ls.append(i[::-1])
        n = ".".join(ls)
        return n
      
