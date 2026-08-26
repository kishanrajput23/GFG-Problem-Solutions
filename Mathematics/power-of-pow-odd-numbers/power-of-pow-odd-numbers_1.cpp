class Solution {
  public:
    int sumofodd(int n) {
        // code here
        int ans = 0;
        int sq = 1;
        
        for (int i=1; i<=n; i++) {
            ans += sq*sq;
            sq += 2;
        }   
        
        return ans;
    }
};