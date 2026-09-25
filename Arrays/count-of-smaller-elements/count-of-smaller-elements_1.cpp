class Solution {
  public:
    int countOfElements(int x, vector<int> &arr) {
        // code here
        int cnt = 0;
        
        for (auto i : arr) {
            if (i <= x) {
                cnt++;
            }
        }
        
        return cnt;
    }
};