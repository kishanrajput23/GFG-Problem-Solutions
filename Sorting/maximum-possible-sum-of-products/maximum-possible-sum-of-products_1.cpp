class Solution {
  public:
    int maxProductSum(vector<int> &a, vector<int> &b) {
        // code here
        sort(a.begin(), a.end());
        sort(b.begin(), b.end());
        int ans = 0;
        
        for(int i=0; i<a.size(); i++) {
            ans += a[i] * b[i];
        }
        
        return ans;
    }
};