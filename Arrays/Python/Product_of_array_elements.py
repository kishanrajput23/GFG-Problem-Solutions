def product(arr,n,mod):
    # your code here
    prod = 1
    for i in arr:
        prod *= i
    return prod % mod
