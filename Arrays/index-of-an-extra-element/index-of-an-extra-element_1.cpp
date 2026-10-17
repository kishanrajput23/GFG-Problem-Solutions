class Solution {
  public:
    int findExtra(vector<int>& a, vector<int>& b) {
        // code here
        for (int i=0; i<a.size(); i++) {
            if (a[i] != b[i]) {
                return i;
            }
        }
    }
};