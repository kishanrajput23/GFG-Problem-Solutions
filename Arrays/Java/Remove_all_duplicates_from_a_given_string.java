class Solution {
    String removeDuplicates(String str) {
        // code here
        int arr[] = new int[256];
        String ans = "";
     
        for(int i=0; i<str.length(); i++){
            if(arr[str.charAt(i)] < 1){
            ans = ans + str.charAt(i);
            arr[str.charAt(i)]++;
        }
            else{
                arr[str.charAt(i)]++;
            }
        }
        return ans;
    }
}
