class Sol
{
    int EvenOdd(String n1 , String n2)
        {
            //code here.
            int a = (int) n1.charAt(n1.length()-1);
            int b = (int) n2.charAt(n2.length()-1);
            int res = a * b;
            if (res%2 == 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
}
