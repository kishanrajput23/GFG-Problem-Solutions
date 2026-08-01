class Geeks{
    static int columnWithMaxZero(int a[][],int n){
        // Your code here
        int temp = 0;
        int result = 0;
        for (int i=0; i<n; i++) {
            int count = 0;
            for (int j=0; j<n; j++) {
                if (a[j][i] == 0) {
                    count++;
                }
            }
            if (count>temp) {
                temp = count;
                result=i;
            }
        }
       return result;
    }
}
