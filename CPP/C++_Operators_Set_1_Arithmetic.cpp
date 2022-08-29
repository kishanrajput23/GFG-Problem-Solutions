class Solution {
  public:
    vector<int> cppOperators(int A, int B) {
        // code here
        return vector<int> {A+B, A*B, abs(A-B), A>B?A/B:B/A};
    }
};
