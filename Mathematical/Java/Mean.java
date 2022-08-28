class Solution {
    static int mean(int N , int[] A) {
        // code here
        int sum = 0;
        for (int x : A) {
            sum += x;
        }
        return sum/N;
    }
};
