def minAnd2ndMin( a, n):
    #code here
    if len(set(a)) <=1:
        return [-1, -1]
    k = sorted(list(set(a)))
    return k[0], k[1]
