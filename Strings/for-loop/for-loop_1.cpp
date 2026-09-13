void utility(string s) {
    // length of string is given by s.length()
    // character at any index i is given by s[i]

    // Write your code here
    for (int i=0; i<s.length(); i+=2) {
        cout << s[i];
    }
}