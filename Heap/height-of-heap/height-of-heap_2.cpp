class Solution {
public:
    int heapHeight(int n, int arr[]) {
        if (n == 1) {
            return 1;
        }
        
        return log2(n);
    }
};