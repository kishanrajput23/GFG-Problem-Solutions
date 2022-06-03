class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            if (arr[i] == x) {
                list.add(i);
                break;
            }
        }
       
        for (int i=n-1; i>=0; i--) {
            if(arr[i] == x) {
                list.add(i);
                break;
            }
        }
       
        if (list.size() == 0) {
            list.add(-1);
            return list;
        }
        return list;
    }
}
