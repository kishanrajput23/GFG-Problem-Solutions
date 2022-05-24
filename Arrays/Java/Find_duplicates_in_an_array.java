class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer>  arrList = new ArrayList<>();
        Arrays.sort(arr);
        int flag = 0;
        for(int i = 0; i < n -1 ; i++){
            if(arr[i] == arr[i+1] && flag == 0){
                arrList.add(arr[i+1]);
                flag = 1;
            }
            if(arr[i] != arr[i + 1]){
                flag = 0;
            }
        }
        if(arrList.isEmpty()){
            arrList.add( -1 );
        }
        return arrList;
    }
}
