
class Solution {
  public:
    int countCamelCase(string s) {
        // code here.
        int count = 0;
        
        for (auto i : s) {
            if (isupper(i)) {
                count++;
            }
        }
        
        return count;
    }
};