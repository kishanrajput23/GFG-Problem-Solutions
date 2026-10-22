class Solution {
  public:
    int findClosest(vector<int>& arr, int k) {
        // Code Here
        int n = arr.size();
        int diff = INT_MAX;
        int ans = arr[0];

        for (int i=0; i<n; i++) {
            if (abs(arr[i] - k) <= diff) {
                diff = k-arr[i];
                ans = arr[i];
            }
        }

        return ans;
    }
};