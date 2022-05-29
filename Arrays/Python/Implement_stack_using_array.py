class MyStack:
    
    def __init__(self):
        self.arr=[]
    
    #Function to push an integer into the stack.
    def push(self,data):
        #add code here
        self.arr.append(data)
    
    #Function to remove an item from top of the stack.
    def pop(self):
        #add code here
        if not self.arr:
           return -1
        return self.arr.pop()
