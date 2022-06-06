class Solution {
    ArrayList<Long> arranged(long a[], int n) {
        ArrayList<Long> arr = new ArrayList<Long>();
        ArrayList<Long> pos = new ArrayList<Long>();
        ArrayList<Long> neg = new ArrayList<Long>();
        for (int i=0; i<n; i++) {
            if (a[i]>0) {
                pos.add(a[i]);
            }
            else {
                neg.add(a[i]);
            }
        }
        for (int i=0; i<n/2; i++) {
            arr.add(pos.get(i));
            arr.add(neg.get(i));
        }
        return arr;
    }
}
