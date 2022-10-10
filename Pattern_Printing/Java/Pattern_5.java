class Solution {

    void printTriangle(int n) {
        // code here
        for(int i = n; i>0; i--){
            for(int j = 0 ;j<i; j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
