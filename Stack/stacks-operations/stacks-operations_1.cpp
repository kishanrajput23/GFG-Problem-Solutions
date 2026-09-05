class myStack {
  private:
    // Define your stack
    stack<int> stk;
    
  public:
    void push(int x) {
        // insert x into stack
        stk.push(x);
    }

    void pop() {
        // remove top ele from stack
        if (!stk.empty()) {
            stk.pop();
        }
    }

    int peek() {
        // return top of stack
        if (!stk.empty()){
            return stk.top();
        }
    }

    int getSize() {
        // return current size of stack
        return stk.size();
    }

    bool isEmpty() {
        // check whether stack is empty
         return stk.size() == 0;
    }
};