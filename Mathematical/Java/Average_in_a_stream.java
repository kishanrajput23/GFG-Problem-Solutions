class Solution {
    float[] streamAvg(int[] arr, int n) {
        float result[]= new float[n];
        float d=1;
        for (int i=0; i<arr.length; i++) {
            float sum=0;
            for (int j=0; j<=i; j++) {
                sum += arr[j];
            }
        sum=sum/d;
        result[i]=sum;
        ++d;
        }
        return result;
    }
}
