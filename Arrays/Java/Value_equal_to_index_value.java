class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0; i<n; i++) {
            if (i+1 == arr[i]) {
                a.add(i+1);
            }
        }
        return a;
    }
}
