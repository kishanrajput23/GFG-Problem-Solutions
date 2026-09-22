class Solution {
  public:
    vector<string> splitString(string s) {
        // code here
        string s1 = "", s2 = "", s3 = "";

        for (char c : s) {
            if (isalpha(c)) {
                s1 += c;
            }
            else if (isdigit(c)) {
                s2 += c;
            }
            else {
                s3 += c;
            }
        }

        if (s1.empty()) s1 = "-1";
        if (s2.empty()) s2 = "-1";
        if (s3.empty()) s3 = "-1";

        return {s1, s2, s3};
    }
};
