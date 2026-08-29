class Solution {
public:
    int heapHeight(int n, int arr[]) {
        if (n == 1)
            return 1;

        int height = 0;

        while (n > 1) {
            height++;
            n /= 2;
        }

        return height;
    }
};