class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        int arr[] = new int [s.size()];
        int i = 0;
        while(!s.isEmpty()) {
            arr[i++] = s.pop();
        }

        for(i=0; i<arr.length; i++) {
            s.push(arr[i]);
        }
    }
}
