class Solution {
  public:
    void segregateEvenOdd(vector<int>& arr) {
        // code here
        sort(arr.begin(), arr.end(), [](int a, int b) {
            if ((a % 2 == 0) != (b % 2 == 0))
                return a % 2 == 0;

            return a < b;
        });
    }
};