class Solution {
    static int[] changeBits(int N) {
        // code here
        int N2 = (1<<((int)(Math.log(N)/Math.log(2)) + 1)) - 1;
        return new int[]{N2-N, N2};
    }
};
