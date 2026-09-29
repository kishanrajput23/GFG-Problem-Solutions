class Solution {
  public:
    int findMissing(vector<int>& arr1, vector<int>& arr2) {
        // code here
        int missnum=0;
        
        for (int i=0; i<arr1.size(); i++) {
            missnum ^= arr1[i];
        }
        
        for (int i=0; i<arr2.size(); i++){
            missnum ^= arr2[i];
        }
        
        return missnum;
    }
};