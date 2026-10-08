class Solution {
  public:
    int swapNibbles(int n) {
        // code here
        int a, b;

        a = n%16;   //take last 4 digits

        b = n/16;   //first 4 digits 

        a = a<<4;   //interchange last to first 

        return a + b;   //return by adding value after interchange
    }
};