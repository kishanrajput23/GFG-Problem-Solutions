def isBinary(str):
    #code here
    for i in range(len(str)):
        if str[i] == '0':
            continue
        elif str[i] == '1':
            continue
        else:
            return False
    return True
