# Your task is to complete all
# three functions

# if the element is found in the list
# function  must return true or else
# return false
def searchEle(a, x):
    # Code here
    if x in a:
        return True
    else:
        return False

# fucntion must return true if 
# insertion is successful or else
# return false
def insertEle(a, y, yi):
    # Code here
    a.insert(yi,y)
    return True

# fucntion must return true if 
# deletion is successful or else
# return false
def deleteEle(a, z):
    # Code here
    if z in a:
        a.remove(z)
    return True
 
