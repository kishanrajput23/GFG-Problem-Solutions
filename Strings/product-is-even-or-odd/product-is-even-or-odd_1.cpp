class Solution {
  public:
    bool isProductEven(vector<int> &arr) {
        // code here
        int prod = 1;
        
        for (auto i : arr) {
            prod *= i;
        }
        
        return prod % 2 == 0;
    }
};