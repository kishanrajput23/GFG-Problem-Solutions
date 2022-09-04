class Solution {

    public void scores(long a[], long b[]) {
        // store the answer as
        // GFG.ca=3;
        // GFG.cb=5;
        // Your code goes here
        
        int as = 0;
        int bs = 0;
        for (int i=0; i<a.length; i++) {
            if (a[i] > b[i]) {
                as++;
            }
            if (a[i] < b[i]) {
                bs++;
            }
        GFG.ca=as;
        GFG.cb=bs;
           
       }
    }
}
