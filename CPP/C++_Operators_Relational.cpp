class Solution{   
public:
    string compareNum(int A,int B){
        // code here 
        string a=to_string(A); 
        string b=to_string(B);
        if(A<B)
            return(a+" is less than "+b);
        else if(A>B)
            return(a+" is greater than "+b);
        else
            return(a+" is equals to "+b);
    }
};
