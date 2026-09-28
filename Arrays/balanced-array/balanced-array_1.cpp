class Solution {
  public:
    int minValueToBalance(vector<int> &arr) {
        // code here
        int leftsum = 0;
        int rightsum = 0;

        int k = arr.size() / 2;

        for (int i=0; i<k; i++) {
            leftsum += arr[i];
            rightsum += arr[k+i];
        }

        return abs(leftsum - rightsum);
    }
};
