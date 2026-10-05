class Solution {
  public:
    vector<int> canMakeTriangle(vector<int>& arr) {
        // code here
        vector<int> v(arr.size() - 2);

        for(int i=0; i<arr.size()-2; i++) {

            int a = arr[i];
            int b = arr[i+1];
            int c = arr[i+2];

            if((a+b)>c && (a+c)>b && (b+c)>a) {
                v[i] = 1;
            }
            else {
                v[i] = 0;
            }
        }
        
        return v;
    }
};