class Solution {
  public:
    vector<int> xorArray(vector<int>& arr) {
        // code here
        int n = arr.size();
        
        for (int i=0; i<n-1; i++) {
            arr[i] = arr[i] ^ arr[i+1];
        }
        
        return arr;
    }
};