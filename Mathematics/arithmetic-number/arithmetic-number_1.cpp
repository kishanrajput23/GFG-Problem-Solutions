class Solution {
  public:
    int inSequence(int a, int b, int c) {
        // code here
        if (c == 0) {
            if (a == b) {
                return 1;
            }
            else {
                return 0;
            }
        }
        else if (a == b) {
            return 1;
        }
        else if (c > 0 && (b - a) % c == 0 && b > a) {
            return 1;
        }
        else if (c < 0 && (b - a) % c == 0 && a > b) {
            return 1;
        }
        else {
            return 0;
        }    
    }
};