class Solution {
  public:
    vector<int> findIndex(vector<int>& arr, int key) {
        // code here
        int n = arr.size();
        vector<int> a = {-1, -1};
        
        for (int i=0; i<n; i++) {
            if (arr[i] == key) {
                a[0] = i;
                break;
            }
        }
        
        for (int i=n-1; i>=0; i--) {
            if (arr[i] == key) {
                a[1] = i;
                break;
            }
        }
        
        return a;        
    }
};