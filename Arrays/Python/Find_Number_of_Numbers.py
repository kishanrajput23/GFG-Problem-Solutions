def num(arr, n, k):
    # Code here
    count = 0
    for i in range(n):
        for j in str(arr[i]):
            if j == str(k):
                count += 1
    return count
