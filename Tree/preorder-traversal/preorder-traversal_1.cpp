/* Structure of Tree Node
class Node {
  public:
    int data;
    Node* left;
    Node* right;

    Node(int val) {
        data = val;
        left = nullptr;
        right = nullptr;
    }
};*/

class Solution {
  public:
    void preOrderTraversal(Node* root, vector<int> &v) {
    if (root == NULL) {
        return ;
    }
    
    v.push_back(root->data);
    preOrderTraversal(root->left, v);       // L
    preOrderTraversal(root->right, v);      // R
}

    vector<int> preOrder(Node* root) {
        // code here
        vector<int> v;
        preOrderTraversal(root, v);
        return v;
    }
};