class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code here
        int l= x.length();
        for (int i=0; i<=s.length()-l; i++) {
            if (s.substring(i,l+i).equals(x)) {
                return i;
            }
        }
        return -1;
    }
}
