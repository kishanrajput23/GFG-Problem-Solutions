class Solution {
  public:
    string longest(vector<string>& arr) {
        // code here
        int MAX = 0;
        string ans = "";
        
        for (int i=0; i<arr.size(); i++) {
            if (arr[i].size() > MAX) {
                MAX = arr[i].length();
                ans = arr[i];
            }
        }
    
        return ans; 
    }
};
