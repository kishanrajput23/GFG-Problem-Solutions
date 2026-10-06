// User function Template for C++

class Solution {
  public:
    vector<long long> jugglerSequence(long long n) {
        // code here
        vector<long long> ans;
        ans.push_back(n);
        
        while (n != 1) {
            if (n % 2 == 0) {
                n = sqrt(n);
            }
            else {
                n = n * sqrt(n);
            }
            ans.push_back(n);
        }
        return ans;
    }
};
