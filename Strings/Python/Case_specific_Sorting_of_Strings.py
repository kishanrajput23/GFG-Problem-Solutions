class Solution:

    #Function to perform case-specific sorting of strings.
    def caseSort(self,s,n):
        #code here
        arrSmall = []
        arrLarge = []
        s = list(s)
        
        for i in s:
            if(97<=ord(i)<=122):
                arrSmall.append(i)
            else:
                arrLarge.append(i)
        
        arrSmall.sort()
        arrLarge.sort()
        countSmall = countLarge = 0
        
        for i in range(n):
            if(97<=ord(s[i])<=122):
                s[i] = arrSmall[countSmall]
                countSmall+=1
            else:
                s[i] = arrLarge[countLarge]
                countLarge+=1
        
        return "".join(i for i in s)
