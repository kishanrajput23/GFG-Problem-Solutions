class Solution {
  public:
    vector<int> findTwoElement(vector<int>& arr) {
        // code here
        int n = arr.size();
        int repeating = -1;
        int missing = -1;
        
        for (int i=0; i<n; ++i) {
            int index = abs(arr[i]) - 1;
            
            if (arr[index] < 0) {
                repeating = abs(arr[i]);
            }
            else {
                arr[index] = -arr[index];
            }
        }
        
        for (int i=0; i<n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }
        return {repeating, missing};
    }
};
