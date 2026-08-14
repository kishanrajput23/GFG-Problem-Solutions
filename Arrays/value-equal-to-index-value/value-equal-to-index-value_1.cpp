class Solution {
  public:
    vector<int> valEqualToPos(vector<int>& arr) {
        // code here
        vector<int> ans;
        
        for (int i=0; i<arr.size(); i++) {
            if (i+1 == arr[i]) {
                ans.push_back(i+1);
            }
        }
        
        return ans;
        
    }
};