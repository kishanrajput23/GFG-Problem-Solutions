class Solution:
    # your task is to complete this function
    # function should return an integer
    def atoi(self,string):
        # Code here
        try:
            c = int(string)
            return c
        except:
            return -1;
