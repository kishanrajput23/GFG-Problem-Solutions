class Solution {
    int maxRepeating(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int count = 0;
        int max = 0;
        int num = -1;
        for (int i=1; i<n; i++) {
            if (arr[i] == arr[i-1]) {
                count++;
            }
            else {
                if(count>max) {
                    max = count;
                    num = arr[i-1];
                }
                count=0;
            }
        }
        if (count>max) {
            max = count;
            num = arr[n-1];
        }
        return num;
    }
}
