class Solution {
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n) {
        // add your code here
        ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();
        for (int i=0; i<n; i++) {
            if (i < d%n) {
                ar1.add(arr[i]);
            }
            else {
                ar2.add(arr[i]);
            }
        }
        for (int i=0; i<ar2.size(); i++) {
            arr[i] = ar2.get(i);
        }
        for (int i=0; i<ar1.size(); i++) {
            arr[i+ar2.size()] = ar1.get(i);
        }
    }
}
