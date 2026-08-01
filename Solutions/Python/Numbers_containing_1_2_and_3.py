def findAll():
    #code here
    r={'1','2','3'}
    for i in range(1,1000001):
        s=set(str(i))
        if s.issubset(r):
            mp[i]=1
