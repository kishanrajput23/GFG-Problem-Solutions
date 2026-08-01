def transitionPoint(arr, n):
    #Code here
    if(sum(arr)==0):
        return -1
    return n - sum(arr)
