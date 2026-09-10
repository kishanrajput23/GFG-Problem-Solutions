class Solution {
public:
    vector<int> findElements(vector<int> arr) {
        sort(arr.begin(), arr.end());
        
        arr.resize(arr.size() - 2);
        
        return arr;
    }
};