class Solution {
  public:
    string uncommonChars(string& s1, string& s2) {
        // code here
        string ans="";
        unordered_set<char>set1(s1.begin(), s1.end());
        unordered_set<char>set2(s2.begin(), s2.end());
        
        for (char x : set1) {
            if (set2.find(x) == set2.end()) {
                ans += x;
            }    
        }
               
        for (char y : set2){
            if (set1.find(y) == set1.end()) {
                ans += y;
            }
        }
        
        sort(ans.begin(),ans.end());
        
        return ans;
    }
};
