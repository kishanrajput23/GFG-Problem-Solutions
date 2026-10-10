class Solution {
  public:
    vector<int> leaders(vector<int>& arr) {
        // code here
        int n = arr.size();
        int maxi = INT_MIN;
        vector<int>ans;
        
        for (int j=n-1; j>=0; j--) {
            if(arr[j] >= maxi){
                ans.push_back(arr[j]);
                maxi = arr[j];
            }
        }
        
        reverse(ans.begin(), ans.end());
        
        return ans;
    }
};