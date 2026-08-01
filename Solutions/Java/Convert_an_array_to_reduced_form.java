class Solution {
    void convert(int[] arr, int n) {
        // code here
        HashMap<Integer,Integer> s = new HashMap<Integer,Integer>();
        int arr1[] = arr.clone();
        Arrays.sort(arr1);
        for (int i=0; i<n; i++) {
            s.put(arr1[i], i);
        }
        for (int i=0; i<n; i++) {
            arr[i]=s.get(arr[i]);
        }
    }
}
