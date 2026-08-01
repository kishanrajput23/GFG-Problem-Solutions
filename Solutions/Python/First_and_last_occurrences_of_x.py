def find(arr,n,x):
    # code here
    a = []
    for i in range(n):
        if arr[i]==x:
            a.append(i)
    if len(a)==1:
        return a*2
    elif len(a)>1:
        return a[0],a[-1]
    else:
        return [-1,-1]
