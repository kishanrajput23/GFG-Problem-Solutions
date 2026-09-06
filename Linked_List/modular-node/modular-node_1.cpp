/*Struture of the node of the linked list is as:

struct Node {
    int data;
    struct Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }

};
*/

class Solution {
  public:
    int modularNode(Node *head, int k) {
        // code here
        int ans = -1;
		int index = 1;
		Node* temp = head;

		while (temp != NULL) {
		    if (index % k == 0) {
			    ans = temp->data;
		    }
	    
	        index++;
			temp = temp->next;
		}
		
		return ans;
    }
};