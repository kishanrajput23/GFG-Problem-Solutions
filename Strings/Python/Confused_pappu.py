class Solution:

    def findDiff(self, amount):
        # code here
        num = int(str(amount).replace('6','9'))
        return num-amount
