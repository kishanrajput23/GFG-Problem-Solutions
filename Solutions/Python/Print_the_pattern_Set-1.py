def printPat(n):
    #Code here
    for i in range(n, 0, -1):
        for j in range(n, 0, -1):
            for k in range(0, i):
                print(j, end= " ")
        print("$", end="")
