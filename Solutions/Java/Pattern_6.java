class Solution {

    void printTriangle(int n) {
        // code here
        for (int i=0; i<n; i++){
            int val=1;
            for(int j=n-i; j>=1; j--){
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
        }
    }
}
