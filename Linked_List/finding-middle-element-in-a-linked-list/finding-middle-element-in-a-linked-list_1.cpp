

/* Link list Node 
struct Node {
    int data;
    Node* next;
    
    Node(int x){
        data = x;
        next = NULL;
    }
    
}; */
class Solution{
    public:
    /* Should return data of middle node. If linked list is empty, then  -1*/
    
    int getLength(Node* head) {
        int count = 0;
        
        while (head != NULL) {
            head = head->next;
            count++;
        }
        return count;
    }
    
    int getMiddle(Node *head)
    {
        // Your code here
        int length = getLength(head);
        int mid = length / 2;
        int count = 0;
        
        while (count < mid) {
            head = head->next;
            count++;
        }
        return head->data;
    }
};

