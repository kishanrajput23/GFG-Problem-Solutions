class Solution {
	public:
	int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}
	
	bool isStrong(int n) {
		// code here.
		int sum = 0;
		int x = n;
		
		while (x != 0) {
			int rem = x % 10;
			sum += fact(rem);
			x /= 10;
		}
		
		if (sum == n) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
};
