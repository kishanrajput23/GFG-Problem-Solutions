class Solution {
  public:
    int countDivisibles(int a, int b, int m) {
        // code here
        int count = 0;
        for (int i=a; i<=b; i++) {
            if (i%m == 0) {
                count++;
            }
        }
        return count;
    }
};