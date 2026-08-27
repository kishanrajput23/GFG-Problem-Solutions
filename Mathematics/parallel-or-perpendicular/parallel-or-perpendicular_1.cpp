class Solution {
  public:
    int checkVectors(int a1, int a2, int a3, int b1, int b2, int b3) {
        // code here
       // Check zero vector
       if ((a1 == 0 && a2 == 0 && a3 == 0) ||
           (b1 == 0 && b2 == 0 && b3 == 0)) {
           return 0;
       }

       // Dot product
       int AB = a1 * b1 + a2 * b2 + a3 * b3;

       // Cross product
       int x = a2 * b3 - a3 * b2;
       int y = a3 * b1 - a1 * b3;
       int z = a1 * b2 - a2 * b1;

       // Parallel
       if (x == 0 && y == 0 && z == 0) {
           return 1;
       }

       // Perpendicular
       if (AB == 0) {
           return 2;
       }

       return 0;
    }
};