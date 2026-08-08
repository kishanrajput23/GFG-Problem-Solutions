class Solution {
  public:
    int largest(vector<int> &arr) {
        // code here
        int largest = INT_MIN;
        
        for (auto i : arr) {
            largest = max(largest, i);
        }
        
        return largest;
        
    }
};
