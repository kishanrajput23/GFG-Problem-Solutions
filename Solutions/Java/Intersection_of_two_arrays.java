class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        for (int i:a) {
            set.add(i);
        }
        int c=0;
        for (int j:b) {
            if (set.contains(j)) {
                c++;
                set.remove(j);
            }
        }
        return c;
    }
};
