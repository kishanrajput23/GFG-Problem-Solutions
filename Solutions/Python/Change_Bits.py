import math
class Solution:
    def changeBits(self, N):
        # code here 
        N2 = (1<<(int(math.log2(N)) + 1)) - 1;
        return [N2-N, N2];
