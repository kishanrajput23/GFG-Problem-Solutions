class Solution:
    def removeAdj(self,v,n):
        # Your code goes here
        stack = []
        for item in v:
            if len(stack)==0:
                stack.append(item)
                continue
            else:
                if item == stack[-1]:
                    stack.pop()
                else:
                    stack.append(item)
        return len(stack)
