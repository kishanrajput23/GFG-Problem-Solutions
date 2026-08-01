from typing import List

class Solution:
    def reverse(self,st): 
        #code here
        s = []
        while len(st)!=0:
            s.append(st.pop())
        return s
