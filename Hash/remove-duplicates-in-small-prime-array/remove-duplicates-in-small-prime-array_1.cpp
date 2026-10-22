class Solution {
  public:
    vector<int> remDuplicate(vector<int>& arr) {
        // code here
        unordered_set<int> mySet;
        vector<int> res;

        for(int i=0; i<arr.size(); i++){
            if(mySet.find(arr[i]) != mySet.end()){
                continue;
            }
            else{
                mySet.insert(arr[i]);
                res.push_back(arr[i]);
            }
        }
        return res;
    }
};
