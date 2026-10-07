class Solution {
  public:
    int findUnique(vector<int> &arr) {
        // code here
        int ans = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            ans ^= arr[i];
        }
        
        return ans;
    }
};