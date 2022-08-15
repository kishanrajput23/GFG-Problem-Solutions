# Your task is to complete this function
# function should store the multiplication in C
def multiply(A, B, C, n):
    # Code here
    for i in range(len(A)):
        for j in range(len(B)):
            for k in range(len(B[j])):
                C[i][j] += A[i][k]*B[k][j]
    return C
