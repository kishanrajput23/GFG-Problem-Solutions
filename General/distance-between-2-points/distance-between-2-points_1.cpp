class Solution {
  public:
    int distance(int x1, int y1, int x2, int y2) {
        // code here
        int d1 = abs(x1-x2);    
        int d2 = abs(y1-y2);

        return int(round(sqrt(d1*d1 + d2*d2)));
    }
};