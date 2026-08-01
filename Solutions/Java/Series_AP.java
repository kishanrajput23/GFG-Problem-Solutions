class Solution {
    int nthTermOfAP(int A1, int A2, int N) {
        // code here
        return A2 + (N-2)*(A2-A1);
    }
}
