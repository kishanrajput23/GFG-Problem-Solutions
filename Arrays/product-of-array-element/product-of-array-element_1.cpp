class Solution {
  public:
    int product(vector<int> &arr) {
        // code here
        const int MOD = 1000000007;
        
        long long ans = 1;
        
        for(int i=0; i<arr.size(); i++){
            ans = (ans * arr[i]) % MOD;
        }
        
        return ans;
    }
};