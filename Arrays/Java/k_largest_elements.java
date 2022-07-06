class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int temp[] = new int [k];
        int i = 0;
        int j = n -1;
        while(k-->0) {
            temp[i] = arr[j];
            i++;
            j--;
        }
        return temp;
    }
}
