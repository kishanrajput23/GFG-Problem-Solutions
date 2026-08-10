/*Structure of the linked list node is as
struct Node {
  int data;
  struct Node * next;
  Node(int x) {
    data = x;
    next = NULL;
  }
}; */

class Solution{
  public:
    //Function to insert a node at the beginning of the linked list.
    Node *insertAtBegining(Node *head, int x) {
       // Your code here
       Node* temp = new Node(x);
       temp->next = head;
       head = temp;
    }
    
    
    //Function to insert a node at the end of the linked list.
    Node *insertAtEnd(Node *head, int x)  {
       // Your code here
       Node* temp = new Node(x);
       if (head == NULL) {
           head = temp;
           return head;
       }
       else {
           Node* curr = head;
           while (curr->next != NULL) {
               curr = curr->next;
           }
            curr->next = temp;
            return head;
       }
    }
};

