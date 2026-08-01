def isSubset( a1, a2, n, m):
    s1 = set(a1)
    s2 = set(a2)
    if s2.intersection(s1) == s2:
        return "Yes"
    else:
        return "No"
