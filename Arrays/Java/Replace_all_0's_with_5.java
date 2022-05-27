class GfG {
    int convertfive(int num) {
        // Your code here
        String convertedInt = "";
        String nums = Integer.toString(num);
        for (int i=0; i<nums.length(); i++) {
            if (nums.charAt(i) == '0') {
                convertedInt += "5";
            }
            else {
                convertedInt += nums.charAt(i);
            }
        }
        return Integer.parseInt(convertedInt);
    }
}
