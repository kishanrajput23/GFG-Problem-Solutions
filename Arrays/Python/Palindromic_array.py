# Your task is to complete this function
# Function should return True/False or 1/0
def PalinArray(arr ,n):
    # Code here
    i = 1
    for j in arr:
        a = str(j)
        if a[::-1] != a:
            i = 0
            break
    return i
