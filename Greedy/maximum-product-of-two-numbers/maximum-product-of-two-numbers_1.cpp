class Solution {
  public:
    int maxProduct(vector<int>& arr) {
        // code here
        int maxi = INT_MIN;
        int secondMaxi = INT_MIN;
        
        for (auto i : arr) {
            if (i > maxi) {
                secondMaxi = maxi;
                maxi = max(maxi, i);
            }
            
            else if (i > secondMaxi) {
                secondMaxi = i;
            }
        }
        return maxi * secondMaxi;
    }
};