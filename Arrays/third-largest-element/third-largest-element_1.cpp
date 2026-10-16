class Solution {
  public:
    int thirdLargest(vector<int> &arr) {
        // code here
        int n = arr.size();
        
        if (n <= 2) {
            return -1;
        }
        
        sort(arr.begin(), arr.end());
        
        return arr[n-3];
    }
};