class Solution {
  public:
    string getBinaryRep(int n) {
        // Code here
        string res = "";
        
        for (int i=0; i<32; i++) {
            res = to_string(n % 2) + res;
            n /= 2;
        }
        
        return res;
    }
};