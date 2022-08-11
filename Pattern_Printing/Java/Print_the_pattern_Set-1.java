class GfG {
    void printPat(int n) {
        // Your code here
        for (int k=0; k<n; k++) {
            for (int i=n; i>=1; i--) {
                for (int j=1; j<= n-k; j++) {
                    System.out.print(i + " ");
               }
            }
            System.out.print("$");
        }
    }
}
