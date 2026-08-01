class complex
{
    int x, y;

    
    public:
    complex(){
        
    }
    
    complex(int real, int imag) {
        x = real; 
        y=imag;
    }
    
    complex operator+(complex c)
    {
        // Add your code here.
        complex temp;
        temp.x = x + c.x;
        temp.y = y + c.y;
        return temp;
    }
    
    void display()
    {
        cout<<x<<" + "<<y<<"i"<<endl;
       
    }
};
