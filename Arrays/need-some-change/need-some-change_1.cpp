class Solution {
  public:
    void swapElements(vector<int> &arr) {
        // code here
        int n = arr.size(); 
        
        if (n <= 2) {
            return ;
        }
        
        for (int i=0; i<n-2; i++) {
            swap(arr[i], arr[i+2]);
        }        
    }
};