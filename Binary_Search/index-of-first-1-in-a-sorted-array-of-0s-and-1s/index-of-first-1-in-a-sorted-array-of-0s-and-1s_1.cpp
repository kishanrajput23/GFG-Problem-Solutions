class Solution {
  public:
    int firstIndex(vector<int> &arr) {
        // code here
        int low = 0;
        int high = arr.size() - 1;
        int mid;
        
        while (low < high) {
            mid = low + (high - low) / 2;
            
            if (arr[mid] == 0) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        
        
        if (arr[mid] == 1){
            return mid;
        }
        else if (arr[mid+1] == 1) {
            return mid + 1;
        }
        
        return -1;
    }
};