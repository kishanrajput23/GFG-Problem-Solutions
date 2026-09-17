class Solution {
  public:
    string conRevstr(string &s1, string &s2) {
        // code here
        string s3 = s1+s2;
        reverse(s3.begin(), s3.end());
        return s3;
    }
};