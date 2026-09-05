/* Structure of linked list Node
class Node {
  public:
    int data;
    Node* next;

    Node(int val) {
        data = val;
        next = nullptr;
    }
};*/

class myStack {
    Node* curr = NULL;
    int top;
        
  public:
    myStack() {
        // Initialize your data members
        top = 0;
    }

    bool isEmpty() {
        // check if the stack is empty
        if (top == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    void push(int x) {
        // Adds an element x at the top of the stack
        Node* head = new Node(x);
        head->next = curr;
        curr = head;
        top++;
    }

    void pop() {
        // Removes the top element of the stack
        Node* temp = curr;
        curr = curr->next;
        temp->next = NULL;
        top--;
    }

    int peek() {
        // Returns the top element of the stack
        // If stack is empty, return -1
        if (top == 0) {
            return -1;
        }
        else {
            return curr->data;
        }
    }

    int size() {
        // Returns the current size of the stack
        return top;
    }
};