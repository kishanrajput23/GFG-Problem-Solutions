class Solution {
  public:
    void segregateEvenOdd(vector<int>& arr) {
        // code here
        int n = arr.size();
        vector<int> even;
        vector<int> odd;

        for (int i=0; i<n; i++) {
            if (arr[i] % 2 == 0){
                even.push_back(arr[i]);
            }
            else {
                odd.push_back(arr[i]);
            }
        }

        sort(even.begin(),even.end());
        sort(odd.begin(),odd.end());

        int k=0;
        for (int i=0; i<even.size(); i++){
            arr[k++] = even[i];
        }

        for (int j=0; j<odd.size(); j++){
            arr[k++] = odd[j];
        }
    }
};