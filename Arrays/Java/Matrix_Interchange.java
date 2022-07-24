class Geeks{
    
    static void interchange(int a[][],int r, int c){
        
        // Your code here
        
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                if (j==0 && r>1 && c>1) {
                   a[i][j] = a[i][j] + a[i][c-1];
                   a[i][c-1] = a[i][j] - a[i][c-1];
                   a[i][j] = a[i][j] - a[i][c-1];
               }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        } 
    }
}
