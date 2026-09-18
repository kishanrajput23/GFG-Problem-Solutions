
string to_upper(string str) {
    // code
    for (int i=0; i<str.size(); i++) {
        str[i] = toupper(str[i]);
    }
    
    return str;
}