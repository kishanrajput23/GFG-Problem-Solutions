class Solution {
  public:
    string printNumber(string& s) {
        // code here
        string tp = "";
        
        for (int i=0; i<s.size(); i++) {
            if(s[i]>='a' && s[i]<='c') {
                tp += '2';
            }
            else if(s[i]>='d' && s[i]<='f') {
                tp += '3';
            }
            else if(s[i]>='g' && s[i]<='i') {
                tp +='4';
            }
            else if(s[i]>='j' && s[i]<='l') {
                tp += '5';
            }
            else if(s[i]>='m' && s[i]<='o') {
                tp += '6';
            }
            else if(s[i]>='p' && s[i]<='s') {
                tp += '7';
            }
            else if(s[i]>='t' && s[i]<='v') {
                tp += '8';
            }
            else if(s[i]>='w' && s[i]<='z') {
                tp += '9';
            }
        }
        return tp;
    }
};
