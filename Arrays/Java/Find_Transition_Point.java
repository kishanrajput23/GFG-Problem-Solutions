class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }
        // if no element is 1
        return -1;
    }
}
