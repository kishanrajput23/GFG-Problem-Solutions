class Solution {
  public:
    int findOR(vector<int>& arr, int x) {
        // code here
        int result = 0;
        
        for (int i=0; i<arr.size(); i++) {
            if (arr[i] % x == 0) {
                result |= arr[i];
            }
        }
    
        return result;
    }
};