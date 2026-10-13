class Solution {
  public:
    int minDist(vector<int>& arr, int x, int y) {
        // code here
        int st = -1; 
        int ed = -1;
        int n = arr.size();
        int md = n; 
        
        for (int i=0; i<n; i++) {
            if (arr[i] == x) { 
                st = i;
            }
            
            if (arr[i] == y) { 
                ed = i;
            }
            
            if (st != -1 && ed != -1) {
                md = min(md, abs(ed - st));
            }
        }
        
        if (st==-1 || ed==-1) {
            return -1;
        }
        
        return md;        
    }
};