from collections import Counter
def findMissing(A,B,N,M):
    # code here
    a = Counter(A)
    b = Counter(B)
    l = []
    for i in A:
        if i not in b.keys():
            l.append(i)
    return l
