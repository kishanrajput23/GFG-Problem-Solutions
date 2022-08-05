class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int st = -1; 
        int ed = -1;
        int md = n; 
        for (int i=0; i<n; i++) {
            if (a[i] == x) { 
                st = i;
            }
            if (a[i] == y) { 
                ed = i;
            }
            if (st != -1 && ed != -1) {
                md = Math.min(md, Math.abs(ed-st));
            }
        }
        if (st==-1 || ed==-1) {
            return -1;
        }
        return md;
    }
}
