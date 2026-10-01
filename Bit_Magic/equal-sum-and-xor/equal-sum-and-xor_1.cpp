class Solution {
  public:
    int countValues(int n) {
        // code here
        int count = 0;
        
        for (int i=0; i<n; i++) {
            if ((n+i) == (n^i)) {
                count++;
            }
        }
        
        return count;
    }
};