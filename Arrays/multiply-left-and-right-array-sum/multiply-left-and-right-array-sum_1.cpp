class Solution {
  public:
    int multiply(vector<int> &arr) {
        // code here
        int n = arr.size();
        int ls = 0;
        int rs = 0;

        for (int i=0; i<n; i++) {
            if (i < n/2) {
                ls += arr[i];
            }
            else {
                rs += arr[i];
            }
        }
        
        return ls * rs;
    }
};