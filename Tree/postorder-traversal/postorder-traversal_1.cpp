/* Structure of Binary Tree Node
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
  
    void postOrderTraversal(Node* root, vector<int> &v) {
        if (root == NULL) {
            return ;
        }

        postOrderTraversal(root->left, v);       // L
        postOrderTraversal(root->right, v);      // R
        v.push_back(root->data);
    }
    
    vector<int> postOrder(Node* root) {
        // code here
        vector<int> v;
        postOrderTraversal(root, v);
        return v;
    }
};