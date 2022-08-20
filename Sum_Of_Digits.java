class Solution{
    static int sumOfDigits(int N) {
        // code here
         int sum=0;
        while (N>0) {
            int digit = N % 10;
            sum += digit;
            N /= 10;
        }
        return sum;
    }
}
