from collections import OrderedDict
def maximumFrequency (S) : 
    #Complete the function
    mdict =OrderedDict()
    strResult =""
    maxFreq = -1
    S = S.split(" ")

    for item in S:
        if item in mdict:
            mdict[item] = mdict[item]+1
        else:
            mdict[item] = 1

    for k, v in mdict.items():
        if v>maxFreq:
            maxFreq = v
            strResult = k +" "+str(v)

    return strResult
