class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashMap<Integer,Integer> h=new HashMap<>();
        for (int i=0; i<Math.max(m,n); i++) {
            if (i<n) {
                h.put(a[i], 1);
            }
            if (i<m) {
                h.put(b[i], 1);
            }
        }
        return h.size();
    }
}
