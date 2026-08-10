class Solution {
  public:
    bool binarySearch(vector<int>& arr, int k) {
        // code here
        int s = 0;
        int e = arr.size()-1;
       
       int mid = (s + e) / 2;
       
        while (s <= e) {
            if (arr[mid] == k) {
                return true;
            }
            else if (arr[mid] < k) {
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
            mid = (s + e) / 2;
        }
        return false;
        
    }
};