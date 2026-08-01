def calculate (arr, n) : 
    #Complete the function
    cnt = 0
    for i in range(n):
        for j in range(i+1, n):
            if arr[i] ^ arr[j] == 0:
                cnt += 1
    return cnt
