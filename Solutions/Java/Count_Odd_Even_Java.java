class Geeks {
    static void countOddEven(int a[], int n) {

        // Your code here
        int e =0; 
        int o=0;
        for (int i=0; i<n; i++) {
            if (a[i]%2 == 0) {
                e += 1;
            }
            else {
                o += 1;
            }
        }
        System.out.print(o + " " + e);
    }
}
