// User function template for C++
class Solution {
  public:

    void rearrange(vector<int> &arr) {
        // code here
        vector<int>pos, neg;
        
        for (int &it : arr) {
            if (it < 0) {
                neg.push_back(it);
            }
            else {
                pos.push_back(it);
            }
        }
        
        int i=0, j=0, ind=0;
        
        while (i < pos.size() && j < neg.size()) {
            arr[ind++] = pos[i++];
            arr[ind++] = neg[j++];
        }
        
        while (i < pos.size()) {
            arr[ind++] = pos[i++];
        }
        
        while (j < neg.size()) {
            arr[ind++] = neg[j++];
        }
        
        return; 
    }
};
