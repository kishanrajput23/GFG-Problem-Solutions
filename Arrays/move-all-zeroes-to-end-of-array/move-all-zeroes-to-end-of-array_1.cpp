// User function template for C++
class Solution {
  public:
    void pushZerosToEnd(vector<int>& arr) {
        // code here
        int zeroCount = 0;
        int j = 0;
        
        for (int i=0; i<arr.size(); i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
            else {
                arr[j++] = arr[i];
            }
        }
        
        while (j < arr.size()) {
            arr[j++] = 0;
        }
    }
};
