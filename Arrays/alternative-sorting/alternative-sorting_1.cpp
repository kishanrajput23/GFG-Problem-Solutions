class Solution {
  public:
    vector<int> alternateSort(vector<int>& arr) {
        // code here
        sort(arr.begin(), arr.end());

        vector<int> ans;

        int i = 0;
        int j = arr.size()-1;

        while (i < j) {
            ans.push_back(arr[j]);
            j--;

            ans.push_back(arr[i]);
            i++;


        }

        if (arr.size() % 2 != 0) {
            ans.push_back(arr[i]);
        }

        return ans;
    }
};
