class Solution{
    public:
    int findSingle(int N, int arr[]){
        // code here
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans ^= arr[i];
        }
        return ans;
    }
};
