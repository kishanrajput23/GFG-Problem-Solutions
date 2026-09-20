class Solution {
  public:
    string removeCharacters(string &s) {
        // code here
        string num = "";
        
        for (auto i : s) {
            if (isdigit(i)) {
                num += i;
            }
        }
        
        return num;
    }
};