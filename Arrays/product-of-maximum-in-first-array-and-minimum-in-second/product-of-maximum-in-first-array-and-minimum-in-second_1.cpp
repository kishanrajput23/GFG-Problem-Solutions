class Solution {
  public:
    int minMaxProduct(vector<int> &arr1, vector<int> &arr2) {
        // code here
        sort(arr1.begin(), arr1.end());
        sort(arr2.begin(), arr2.end());
        
        return arr1[arr1.size() - 1] * arr2[0];
    }
};