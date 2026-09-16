class Solution {
  public:

    string firstAlphabet(string &s) {
        // code here
        int n = s.size();
        string st = "";
        
		for (int i = 0; i<n; ++i) {
			if (i == 0 || s[i - 1] == ' ') {
				st += s[i];
			}
		}
		
		return st;
    }
};