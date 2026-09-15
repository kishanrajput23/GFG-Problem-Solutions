class Solution {
  public:
    int extractMaximum(string &s) {
        // code here
        string num = "";
        int maxi = INT_MIN;

        for (char c : s) {
            if (isdigit(c)) {
                num += c;
            }
            else {
                if (!num.empty()) {
                    maxi = max(maxi, stoi(num));
                    num = "";
                }
            }
        }
        
        // Process last number
        if (!num.empty()) {
            maxi = max(maxi, stoi(num));
        }

        return maxi == INT_MIN ? -1 : maxi;
    }
};