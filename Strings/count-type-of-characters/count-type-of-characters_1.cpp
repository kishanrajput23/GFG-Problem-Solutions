class Solution {
  public:
    vector<int> count(string &s) {
        // code here.
        int lower = 0;
        int upper = 0;
        int special = 0;
        int numeric = 0;
        
        for (auto i : s) {
            if (islower(i)) {
                lower++;
            }
            else if (isupper(i)) {
                upper++;
            }
            else if (isdigit(i)) {
                numeric++;
            }
            else {
                special++;
            }
        }
        
        return {upper, lower, numeric, special};
    }
};