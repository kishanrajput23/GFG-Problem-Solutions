class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        HashSet<Integer> hs = new HashSet<Integer>();
        int count[] = new int[arr1.length + arr2.length];
        for (int i=0; i<arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i=0; i<arr2.length; i++) {
            hs.add(arr2[i]);
        }
        for (int x:hs){
            arr.add(x);
        }
        Collections.sort(arr);
        return arr;
    }
}
