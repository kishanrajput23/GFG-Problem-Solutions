class Solution {

    void printTriangle(int n) {
        // code here
        for (int i = n; i >=1; i--) {

            for (int j = 1; j <=i; j++) {

                char c = (char) (64+j);

                System.out.print(c);

            }

            System.out.println();
        }
    }
}
