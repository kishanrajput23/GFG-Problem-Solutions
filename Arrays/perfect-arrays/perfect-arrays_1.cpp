class Solution {
  public:
    bool isPalindrome(vector<int> &arr) {
        // code here
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
};
