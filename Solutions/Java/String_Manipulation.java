class Solution {
    static int removeConsecutiveSame(Vector <String > v) {
        // Your code goes here
        Stack<String> st = new Stack<>();
        for (String x : v) {
            if (st.isEmpty()) {
                st.push(x);
            }
            else {
                if (st.peek().equals(x)) {
                    st.pop();
                }
                else {
                    st.push(x);
                }
            }
        }
        return st.size();
    }
}
