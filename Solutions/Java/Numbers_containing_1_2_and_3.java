//Function to find all the numbers with only 1,2 and 3 in their digits.
public static void findAll()
{
    //Your code here
    for (int i=1; i<=1000000; i++) {
        String s = Integer.toString(i);
        if (s.matches("[1-3]+")) {
            mp.put(i, 1);
        }
    }
}
