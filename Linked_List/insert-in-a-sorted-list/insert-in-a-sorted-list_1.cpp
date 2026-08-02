/*
structure of the node of the list is as
struct Node
{
    int data;
    struct Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }
};
*/

class Solution{
  public:
    // Should return head of the modified linked list
    Node *sortedInsert(struct Node* head, int data) {
        // Code here
        if (head == NULL) {
            return head;
        }
        
        if (head->data > data) {
            Node* d = new Node(data);
            d->next = head;
            head = d;
        }
        else {
            Node* temp = head;
            while (temp->next != NULL && temp->next->data < data) {
                temp = temp->next;
            }
            
            Node* d = new Node(data);
            Node* nextNode = temp->next;
            temp->next = d;
            d->next = nextNode;
            
        }
        return head;
    }
};

