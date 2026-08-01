class Solution{
    static int xorGate(int arr[] , int N){
        //code here
        int xor = arr[0];
        for (int i=1; i<N; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
};
