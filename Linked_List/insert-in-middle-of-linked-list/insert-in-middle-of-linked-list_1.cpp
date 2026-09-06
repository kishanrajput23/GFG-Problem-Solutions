/* Strucutre of a link list node
class Node {
  public:
    int data;
    Node* next;

    Node(int val) {
        data = val;
        next = nullptr;
    }
};
*/

class Solution {
  public:
    Node *insertInMiddle(Node *head, int x) {
        // code Here
		Node* temp = new Node(x);

		if (head == NULL) {
			   return temp;
		}
		
		Node* slow = head;
		Node* fast = head;

		while (fast->next != NULL && fast->next->next != NULL) {
			   fast = fast->next->next;
			   slow = slow->next;
		}

		temp->next = slow->next;
		slow->next = temp;

		return head;
    }
};