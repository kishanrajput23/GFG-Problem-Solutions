
class Solution {
  public:
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    int maxStep(vector<int>& arr) {
        // Your code here
        int ans = INT_MIN;
        int count = 0;
        
        for (int i=0; i<arr.size()-1; i++) {
            if (arr[i] < arr[i+1]) {
                count++;
            }
            else {
                ans = max(ans, count);
                count = 0;
            }
        }
        
        ans = max(ans, count);
        
        return ans;
    }
};
