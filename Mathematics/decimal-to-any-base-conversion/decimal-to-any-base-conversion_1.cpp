class Solution {
  public:
    string decimalToBase(int b, int n) {
        // code here
        string result="";
        int digit;
        string temp;
        
        while (n > 0) {
            digit = n % b;
            temp = to_string(digit);

            switch (digit) {
                case 10: temp="A";
                break;

                case 11: temp="B";
                break;

                case 12: temp="C";
                break;

                case 13: temp="D";
                break;

                case 14: temp="E";
                break;

                case 15: temp="F";
                break;
            }
            result = temp + result;
            n /= b;
        }
        return result;
    }
};