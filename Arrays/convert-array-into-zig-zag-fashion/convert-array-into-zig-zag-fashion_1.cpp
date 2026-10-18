class Solution {
  public:
    void zigZag(vector<int> &arr) {
        // code here
        bool flag = true;
        int n = arr.size();

        for (int i=0; i<=n-2; i++) {
            if (flag) {     // we maintaing first order as <
                if (arr[i] > arr[i+1]) {
                    swap(arr[i], arr[i+1]);
                }
            }
            else {
                if (arr[i] < arr[i+1]) {
                    swap(arr[i], arr[i+1]);
                }
            }
            flag = !flag;        
        }
    }
};
