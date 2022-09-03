class Solution{
    static void printPattern(int N){
        // code here
        for (int i=0; i<N; i++) {
            for (int j=0; j<=i; j++) {
               System.out.print("*" );
           }
           System.out.print(" ");
        }
    }
}
