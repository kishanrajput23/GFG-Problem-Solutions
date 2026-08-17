/* Strucutre of a Node in linked list
class Node {
public:
    int data;
    Node* next;

    Node(int x) {
        data = x;
        next = nullptr;
    }
}; */
class Solution {
  public:
    bool areIdentical(Node *head1, Node *head2) {
        // code here
        Node* l1 = head1;
        Node* l2 = head2;

        while (l1 != NULL && l2 != NULL) {
            if (l1->data == l2->data) {
                l1 = l1->next;
                l2 = l2->next;
            }
            else {
                return false;
            }

        }
        
        if (l1 != NULL || l2 != NULL) {
            return false;
        }
        
        return true;
    }
};