class Solution {
  public:
    vector<int> find(int l, int b, int h) {
        // code here
        return {2*((l*b) + (b*h) + (h*l)), l*b*h};
    }
};