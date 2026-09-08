class Solution {
  public:
    string uncommonChars(string& s1, string& s2) {
        // code here
        vector<int> count1(26);
        vector<int> count2(26);
        
        for (char ch: s1) {
            count1[ch-'a'] = 1;
        }
                 
        for (char ch: s2) {
            count2[ch-'a'] = 1;
        }
                
        string ans="";
        for (int i=0; i<26; i++) {
            if (count1[i] != count2[i]) {
                ans += char('a' + i);
            }
        }
        
        return ans;
    }
};
