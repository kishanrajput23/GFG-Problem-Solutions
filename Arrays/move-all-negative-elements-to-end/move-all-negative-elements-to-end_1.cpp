class Solution {
  public:
    void segregateElements(vector<int>& arr) {
        // code here
        vector<int> pos;
        vector<int> neg;
        vector<int> res;
        int n = arr.size();
        
        for (int i=0; i<n; i++) {
            if (arr[i]<0) {
                neg.push_back(arr[i]);
            }
            else {
                pos.push_back(arr[i]);
            }
        }
        
        for (int i=0; i<pos.size(); i++) {
            res.push_back(pos[i]);
        }
        
        
        for (int i=0; i<neg.size(); i++) {
            res.push_back(neg[i]);
        }

        for (int i=0; i<n; i++) {
            arr[i] = res[i];
        }
        
    }
};