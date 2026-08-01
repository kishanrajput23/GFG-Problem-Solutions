class Solution{
    static int orGate(int arr[] , int N){
       //code here
       int or=arr[0];
        for (int i=1; i<N; i++) {
            or = or|arr[i];
        }
        return or;
    }
}
