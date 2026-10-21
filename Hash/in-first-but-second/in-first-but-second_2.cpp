class Solution {
  public:
    vector<int> findMissing(vector<int>& a, vector<int>& b) {
        // code here
        int n = a.size();
        int m = b.size();

        unordered_set<int> s;

        for(int i = 0; i < m; i++){
            s.insert(b[i]);
        }

        vector<int> ans;

        for(int i = 0; i < n; i++){
            if(s.find(a[i]) == s.end()){
                ans.push_back(a[i]);
            }
        }

        return ans;          
    }
};
