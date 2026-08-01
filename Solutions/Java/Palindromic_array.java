class GfG {
	public static int palinArray(int[] a, int n) {
	    //add code here.
        for(int i = 0; i<n; i++) {
            int eleme = a[i];
    	    int elem = eleme;
    	    int rev = 0, rem = 0;
    	    while (elem != 0) {
    	        rem = elem%10;
    	        rev = rev*10+rem;
    	        elem = elem/10;
    	    }
    	    if (eleme != rev) {
    	        return 0;
    	    }
        }
    	return 1;
	}
}
