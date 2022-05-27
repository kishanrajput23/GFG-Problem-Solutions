class GFG
{
    ArrayList<Long> find(long arr[], int n, int x) {
        ArrayList<Long> al = new ArrayList<>();
        long f = -1, l = -1;
        for (int i=0; i<n; i++) {
            if (arr[i] == x) {
                f = (long) i;
                break;
            }
        }
        for (int i=n-1; i>=0; i--) {
            if (arr[i] == x) {
                l = (long) i;
                break;
            }
        }
        al.add(f);
        al.add(l);
        return al;
   }
}
