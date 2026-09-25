class Solution {
  public:
    pair<int, int> countOddEven(vector<int> &arr) {
        // code here
        int even = 0;
        int odd = 0;
        
        for (int i=0; i<arr.size(); i++) {
            if (arr[i] % 2 == 0) {
                even += 1;
            }
            else {
                odd += 1;
            }
        }
        
        return {odd, even};
    }
};