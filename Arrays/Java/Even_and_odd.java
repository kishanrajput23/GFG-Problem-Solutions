class Solution {
    static void reArrange(int[] arr, int N) {
        // code here
        int i=0;
        int j=1;
        while (i<N && j<N) {
            while (i<N && arr[i]%2==0) {
                i += 2;
            }
            while (j<N && arr[j]%2!=0) {
                j+=2;
            }
            if (i<N && j<N) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i+=2;
                j+=2;
            }
        }
    }
};
