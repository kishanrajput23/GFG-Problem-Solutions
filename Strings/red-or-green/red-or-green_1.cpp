class Solution {
  public:
    int redOrGreen(string &s) {
        // code here
        int R = 0, G = 0;
        
        for (auto i : s) {
            if (i == 'R') {
                R++;
            }
            else {
                G++;
            }
        }
        
        return R > G ? G : R;
    }
};