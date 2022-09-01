class Sol
{
    int[] count (String s)
    {
        // your code here   
        int arr[] = new int [4];
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c>='A' && c<='Z') {
                arr[0]++;
            }
            else if (c>='a' && c<='z') {
                arr[1]++;
            }
            else if (Character.getNumericValue(c)>=0 && Character.getNumericValue(c)<=9) {
                arr[2]++;
            }
            else {
                arr[3]++;
            }
       }
       return arr;
    }
}
