/* Binary Tree Node Structure
class Node {
    public:
    int data;
    Node *left;
    Node *right;

    Node(int val) {
        data = val;
        left = right = nullptr;
    }
};
*/

class Solution {
  public:
    void inorder(Node* root, int &count) {
        if (root == NULL) {
            return ;
        }

        inorder(root->left, count);

        if (root->left != NULL || root->right != NULL) {
            count++;
        }

        inorder(root->right, count);
    }
    
    int countNonLeafNodes(Node* root) {
        // Code here
        int count = 0;
        
        inorder(root, count);
        
        return count;
    }
};