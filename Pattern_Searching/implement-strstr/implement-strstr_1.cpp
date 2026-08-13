class Solution {
public:
    int firstOccurence(string& txt, string& pat) {

        int n = txt.size();
        int m = pat.size();

        for (int i = 0; i <= n - m; i++) {

            if (txt.substr(i, m) == pat) {
                return i;
            }
        }

        return -1;
    }
};