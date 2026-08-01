class Solution {
    static int[] getAreas(int L , int W , int B , int H , int R) {
        // code here
        int [] a = new int[3];
        a[0] = L * W;
        a[1] = (int) (0.5 * B * H);
        a[2] = (int) (3.14 * R * R);
        return a;
    }
};
