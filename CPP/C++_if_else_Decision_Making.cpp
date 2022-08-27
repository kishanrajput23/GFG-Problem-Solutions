class Solution{   
public:
    string compareFive(int n){
        // code here 
        if (n>5) {
            return "Greater than 5";
        }
        else if (n==5) {
            return "Equal to 5";
        }
        else {
            return "Less than 5";
        }
    }
};
