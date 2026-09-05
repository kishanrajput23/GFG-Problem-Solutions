class myStack {
  public:
  int top;
    vector<int> arr;
    int size;
      
    myStack(int n) {
        // Define Data Structures
        top = -1;
        size = n;
        arr.resize(n);
    }

    bool isEmpty() {
        // check if the stack is empty
        return top == -1;
    }

    bool isFull() {
        // check if the stack is full
        return top == size - 1;
    }

    void push(int x) {
        // inserts x at the top of the stack
        if (isFull()) {
            return;
        }
        
        arr[++top] = x;
    }

    void pop() {
        // removes an element from the top of the stack
        if (isEmpty()) {
            return;
        }

        top--;
    }

    int peek() {
        // Returns the top element of the stack
        if (isEmpty())  {
            return -1;
        }
        
        return arr[top];
    }
};