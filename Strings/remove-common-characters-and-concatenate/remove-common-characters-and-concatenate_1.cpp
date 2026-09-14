class Solution {
  public:
    string concatenatedString(string s1, string s2) {

        // Frequency array to mark characters present in s2
        vector<int> v(26, 0);
        string ans = "";

        // Store frequency/presence of characters from s2
        for(char x : s2) {
            v[x - 'a']++;
        }

        // Add only those characters from s1
        // that are not present in s2
        for(char x : s1) {
            if(v[x - 'a'] == 0) {
                ans += x;
            }
        }

        // Frequency array to mark characters present in s1
        vector<int> v2(26, 0);

        // Store frequency/presence of characters from s1
        for(char x : s1) {
            v2[x - 'a']++;
        }

        // Add only those characters from s2
        // that are not present in s1
        for(char x : s2) {
            if(v2[x - 'a'] == 0) {
                ans += x;
            }
        }

        // If no uncommon characters exist, return "-1"
        if(ans.length() == 0) {
            ans = "-1";
        }
        
        return ans;
    }
};