class Solution {
  public:
    string removeSpaces(string& s) {
        // code here
        int n = s.size();
		int j = 0;
		
		for (int i=0; i<n; ++i) {
			if (s[i] != ' ') {
				swap(s[i], s[j++]);
			}
		}
		
		return s.substr(0, j + 1);
    }
};