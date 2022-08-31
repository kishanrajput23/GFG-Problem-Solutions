class Solution:
    def splitString(ob, S): 
        # code here 
        S1=''
        S2=''
        S3=''
        for i in S:
            if i.isalpha():
                S1 += i
            elif i.isdigit():
                S2 += i
            else:
                S3 += i
        return S1,S2,S3
