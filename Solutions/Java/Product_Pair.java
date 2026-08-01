class Solution {
    boolean isProduct(int[] arr, int n, long x) {
        // code here
        HashSet<Long> set = new HashSet<>();
        for (int i=0; i<n; i++) {
            if (arr[i]!=0 && x%arr[i]==0) {
                if (set.contains(x/arr[i])) {
                    return true;
                }
                else {
                    set.add(Long.valueOf(arr[i]));
                }
            }
        }
        return false;
    }
}
