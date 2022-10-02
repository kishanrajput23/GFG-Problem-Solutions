class Solution {

    void printTriangle(int n) {
        int sum = 1;
        for (int i = 1; i<=n;i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(sum+ " ");
                sum++;
            }
            System.out.println();
        }
    }
}
