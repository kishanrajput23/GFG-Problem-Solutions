/* Structure of link list node
class Node {
  public:
    int data;
    Node* next;

    Node(int val) {
        data = val;
        next = nullptr;
    }
};*/

class Solution {
  public:
    bool isEven(Node* head) {
        // code here
        int count = 0;
        
        while (head != nullptr) {
            head = head->next;
            count++;
        }
        
        if (count % 2 == 0) {
            return 1;
        }
        
        return 0;
    }
};