class Solution {
  public:
    int revNum(int n) {
        int res = 0;
        
        while (n > 0) {
            int rem = n % 10;
            res = res*10 + rem;
            n /= 10;
        }
        return res;
    }
    
    bool isPalinArray(vector<int> &arr) {
        // code here
        for (auto i : arr) {
            if (i != revNum(i)) {
                return false;
            }
        }
        return true;
    }
};