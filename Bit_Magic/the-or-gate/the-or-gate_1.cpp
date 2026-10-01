class Solution {
  public:
    int orGate(vector<int> &arr) {
        // code here
        int ans = arr[0];
    
        for (int i=1; i<arr.size(); i++) {
            ans = ans | arr[i];
        }
    
        return ans;
    }
};