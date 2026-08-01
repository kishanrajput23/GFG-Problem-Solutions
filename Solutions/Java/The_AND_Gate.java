class Solution{
    static int andGate(int arr[] , int N){
        //code here
        int and=1;
        for(int i=0; i<N; i++){
            and = and & arr[i];
        }
        return and;
    }
}
