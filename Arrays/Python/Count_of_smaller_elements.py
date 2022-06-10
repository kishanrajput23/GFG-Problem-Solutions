def countOfElements( a, n, x):
    cnt = 0
    for i in range(n):
        if a[i] <= x:
            cnt += 1
    return cnt
