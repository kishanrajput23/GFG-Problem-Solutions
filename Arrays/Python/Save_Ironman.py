class Complete{
    // Function for finding maximum and value pair
    public static boolean saveIronman (String s) {
        //Complete the function
        if (s.length()==1) {
            return true;
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = new String(sb);
        return(rev.equals(s));
    }
}
