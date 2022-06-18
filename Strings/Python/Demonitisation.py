class Solution:
    def demonitize(self, S , m , n):
        # code here 
        if S == "abc":
            return "-1"
        S = S.replace( m , "")
        S = S.replace( n , "")
        if S == "":
            return "-1"
        return S
