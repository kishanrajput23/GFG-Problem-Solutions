class Solution {
  public:
    vector<int> findMissing(vector<int>& a, vector<int>& b) {
        // code here
        map<int, int> mp;
        
	    for (int i=0; i<b.size(); i++) {
	        mp[b[i]]++;
	    }

	    vector<int> v;

	    for (int i=0; i<a.size(); i++) {
	        if (mp.find(a[i]) == mp.end()) {
	            v.push_back(a[i]);
	        }
	    }
	    
	    return v;        
    }
};
