def missingNumber(a, n):
    # Your code goes here
    total = n*(n+1)//2
    return total - sum(a)
