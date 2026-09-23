class Solution {
  public:
    bool commonString(vector<string> &s, vector<string> &t) {
        // Code here
        unordered_set<string> st(s.begin(), s.end());

        for (string str : t) {
            if (st.count(str)) {
                return true;
            }
        }

        return false;
    }
};