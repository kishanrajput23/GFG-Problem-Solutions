/* Structure of Linked List Node
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
    int getKthFromLast(Node* head, int k) {
        // code here
        Node* slow = head;
        Node* fast = head;

        // Move fast pointer n steps ahead
        for (int i = 0; i < k; i++) {

            // n is greater than length
            if (fast == NULL) {
                return -1;
            }

            fast = fast->next;
        }

        // Move both pointers together
        while (fast != NULL) {
            slow = slow->next;
            fast = fast->next;
        }

        return slow->data;
    }
};