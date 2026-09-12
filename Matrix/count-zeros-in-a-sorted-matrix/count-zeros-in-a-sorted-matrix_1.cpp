//Back-end complete function Template for C++

class Solution {
  public:
    int countZeros(vector<vector<int>>& mat) {
        // code here
        int count = 0;
	
	    for (int i=0; i<mat.size(); i++) {
		    for (int j=0; j<mat.size(); j++) {
		        if (mat[i][j] == 0) {
		            count++;
		        }
		    }
		}
		
		return count;
    }
};