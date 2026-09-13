class Solution {
  public:
    int binarySubstring(string& s) {
        // code here
        int count = 0;
	    int temp = 0;
    
	    for (int i=0; i<s.length(); i++) {
		    if (s[i] == '1') {
			    count += temp;
	            temp++;
	        }
	    }
	    
	    return count;
    }
};