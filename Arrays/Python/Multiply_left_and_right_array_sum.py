def multiply (arr, n) : 
    #Complete the function
    k = n//2
    return sum(arr[:k]) * sum(arr[k:])
