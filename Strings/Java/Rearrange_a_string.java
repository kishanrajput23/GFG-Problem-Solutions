class Solution
{
    public String arrangeString(String s) {
        //code here.
        String arr[] = new String[26];
        Arrays.fill(arr,"");
        int sum = 0;
        String str = "";
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
                arr[s.charAt(i)-'A'] += s.charAt(i);
            }
            else {
                sum += s.charAt(i)-'0';
            }
        }
        for (int i=0; i<26; i++) {
            str += arr[i];
        }
        
        if (sum!=0) {
            str+=sum;
        }
        return str;
    }
}
