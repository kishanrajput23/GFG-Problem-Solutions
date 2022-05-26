def PalinArray(arr ,n):
    # Code here
    flag = True
    for i in range(n):
        x = int(str(arr[i])[::-1])
        if arr[i] != x:
            flag = False
            break 
    return flag
