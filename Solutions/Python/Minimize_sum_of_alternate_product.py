def altProduct( arr, n):
    # Your code goes here 
    arr.sort()
    s = 0
    for i in range(n//2):
        s = s + arr[i] * arr[n-1-i]
    return s
