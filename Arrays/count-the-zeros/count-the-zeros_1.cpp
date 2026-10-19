class Solution {
  public:
    int countZeroes(vector<int> &arr) {
        // code here
        int n = arr.size();
        int count = 0;
        
         for (int i=0; i<n; i++) {
            if (arr[i] == 0) {
                count += 1;
            }
        }
        
        return count;        
    }
};