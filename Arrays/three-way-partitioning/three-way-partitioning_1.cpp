class Solution {
  public:
    void threeWayPartition(vector<int>& arr, int a, int b) {
        // code here
        int n=arr.size();

        int low = 0, high = n-1, mid = 0;

        while (mid <= high){
            if (arr[mid] < a) {
                swap(arr[mid++], arr[low++]);
            }

            else if (arr[mid] >=a && arr[mid] <= b){
                mid++;
            }
            else {
                swap(arr[mid], arr[high--]);
            }
        }    
    }
};