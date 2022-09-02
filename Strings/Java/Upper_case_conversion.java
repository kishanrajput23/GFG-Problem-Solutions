class Solution
{
    public String transform(String s)
    {
        // code here
        String[] arr = s.split(" ");
        String result="";
        for (int i=0; i<arr.length; i++) {
            arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1, arr[i].length());
            result += arr[i] + " ";
        }
        
        return result;
    }
}
