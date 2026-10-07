class Solution {
  public:
    int setBits(int n) {
        // Code here
        int count = 0;
        
        while(n > 0){
            if (n%2 != 0) {
                count++;
            }
            n = n/2;
        }        
        
        return count;
    }
};