/* Node Structure
class Node {
public:
    int data;
    struct Node* left;
    struct Node* right;
    Node(int val) {
        data = val;
        left = right = nullptr;
    }
}; */

class Solution {
  public:
    int count = 0;
    
    int getSize(Node* root) {
        // code here
        if (root == NULL) {
            return 0;
        }

        getSize(root->left);

        if (root != NULL) {
            count++;
        }

        getSize(root->right);

        return count;
    }
};