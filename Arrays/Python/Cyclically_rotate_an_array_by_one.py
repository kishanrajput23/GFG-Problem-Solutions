def rotate(arr, n):
    num = arr.pop()
    arr.insert(0, num)
    return arr
