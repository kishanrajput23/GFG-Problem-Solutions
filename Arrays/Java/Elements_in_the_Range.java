class Solution
{
    boolean check_elements(int arr[], int n, int A, int B) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<n; i++) {
            set.add(arr[i]);
        }
        for (int i=A; i<=B; i++) {
            if (!set.contains(i)) {
            return false;
            }
        }
        return true;
    }
}
