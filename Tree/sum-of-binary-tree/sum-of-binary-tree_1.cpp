/* Tree Node Structure
class Node {
public:
    int data;
    Node* left;
    Node* right;
    Node(int val) {
        data = val;
        left = right = nullptr;
    }
};*/

class Solution {
  public:
    int sumBT(Node* root) {
        // code here
        if (root == NULL) {
            return 0;
        }

        int left = sumBT(root->left);

        int right = sumBT(root->right);

        return root->data + left + right;
    }
};