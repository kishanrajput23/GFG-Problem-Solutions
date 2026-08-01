class Solution{
    static int evenlyDivides(int N){
        // code here
        int n=N;
        int count = 0;
        int temp;
        while (n != 0) {
            temp = n % 10;
            if ( temp != 0 && N % temp == 0) {
                count ++;
            }
            n = n/10;
        }
        return count;
    }
}
