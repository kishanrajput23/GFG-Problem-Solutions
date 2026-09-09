class Solution {
  public:
    bool checkIsAP(vector<int> &arr) {
        // Your code goes here
        int n = arr.size();
        sort(arr.begin(), arr.end());
        
        int d = arr[n-1] - arr[n-2];
        
        for (int i=n-2; i>0; i--) {
            int diff = arr[i] - arr[i-1];
            
            if (diff != d) {
                return false;
            }
        }
        
        return true;
    }
};