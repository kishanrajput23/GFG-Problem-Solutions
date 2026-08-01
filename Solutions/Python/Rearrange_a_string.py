class Solution:
    def arrangeString(self, s):
        # code here
        num = []
        arr = []
        for i in s:
            if i.isdigit():
                num.append(int(i))
            else:
                arr.append(i)
        x = sum(num)
        x = [x]
        arr.sort()
        if x != [0]:
            arr.extend(x)
        return "".join(map(str,arr))
