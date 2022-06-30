class Solution
{
    public int klengthpref(String[] arr, int n, int k, String str) {
        str=str.substring(0,k);
        int count=0;
        for(int i=0; i<n; i++) {
            if(arr[i].length()<k) {
                continue;
            }
            String temp = arr[i].substring(0,k);
            if (temp.equals(str)) {
                count++;
            }
        }
        return count;
    }
}
