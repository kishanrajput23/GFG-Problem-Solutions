class Solution {
  public:
    vector<int> findElements(vector<int> arr) {
        // code here
        sort(arr.begin(), arr.end());
        
        vector<int> ans;

        for (int i = 0; i < arr.size() - 2; i++) {
            ans.push_back(arr[i]);
        }

        return ans;
        
    }
};