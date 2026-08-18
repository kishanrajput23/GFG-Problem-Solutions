class Solution {
  public:
    double findMedian(vector<int> &arr) {
        // code here.
        int n = arr.size();
        double res;
        
        sort(arr.begin(),arr.end());
        
        if (n % 2 == 0) {
            res = (arr[n/2] + arr[(n/2)-1]) / 2.0;
        }
        else {
            res = arr[n/2];
        }
        
        return res;
    }
};