class Solution {
  public:
    string convert(string& s) {
        // code here
        int n = s.size();
		
		for (int i = 0; i<n; ++i) {
			if (i == 0 || s[i - 1] == ' ') {
				s[i] = toupper(s[i]);
			}
		}
		
		return s;
    }
};