def Rearrange (arr,  n) :
    #Complete the function
    i = 0
    while i < n:
        if arr[i] != -1 and arr[i] != i:
            temp = arr[arr[i]]
            arr[arr[i]] = arr[i]
            arr[i] = temp
        else:
            i += 1
    return arr
