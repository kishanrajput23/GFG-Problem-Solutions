stack = []
   for i in S:
       stack.append(i)
   S = ''
   for i in range(len(stack)):
       S += stack.pop()
       
   return S
