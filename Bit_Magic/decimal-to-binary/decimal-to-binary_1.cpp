class Solution {
  public:
    string decToBinary(int n) {
        // code here
        string str;
        while (n) { 
            if (n & 1) {// 1 
                str += '1'; 
            }
            else { // 0 
                str += '0'; 
            }

            n >>= 1; // Right Shift by 1   
        }    
    
        reverse(str.begin(), str.end());
        return str;
    }
};