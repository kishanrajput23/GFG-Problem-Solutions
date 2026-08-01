class Solution {
    int countSubstr (String S) {
        // your code here   
        int count = 0;
	    for (int i=0; i<S.length(); i++) {
	        if (S.charAt(i) == '1') {
	            count++;
	        }
	        else {
	            continue;
	        }
	    }
	    return count * (count-1)/2;
    }
}
