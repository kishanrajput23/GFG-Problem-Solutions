/*
Structure of linked list node:

struct Node
{
    int data;
    Node* next;

    Node(int val)
    {
        data = val;
        next = NULL;
    }
};
*/

class Solution
{
public:

    // --------------------------------------------------------
    // Detects whether a cycle exists using Floyd's Algorithm.
    //
    // Returns:
    //   - Intersection node if a cycle exists.
    //   - NULL otherwise.
    // --------------------------------------------------------
    Node* floydCycleDetect(Node* head) {

        Node* slow = head;
        Node* fast = head;

        while (fast != NULL && fast->next != NULL) {

            // Slow moves one step
            slow = slow->next;

            // Fast moves two steps
            fast = fast->next->next;

            // Both pointers meet => cycle detected
            if (slow == fast) {
                return slow;
            }
        }

        // No cycle found
        return NULL;
    }

    // --------------------------------------------------------
    // Removes the loop from the linked list without
    // losing any nodes.
    // --------------------------------------------------------
    void removeLoop(Node* head)
    {
        // Empty list or single node
        if (head == NULL || head->next == NULL) {
            return;
        }

        // Step 1: Detect the cycle
        Node* intersection = floydCycleDetect(head);

        // No cycle present
        if (intersection == NULL) {
            return;
        }

        // ----------------------------------------------------
        // Step 2: Find the starting node of the loop.
        // Move one pointer to head.
        // Move both pointers one step at a time.
        // Their meeting point is the start of the loop.
        // ----------------------------------------------------
        Node* slow = head;

        while (slow != intersection) {
            slow = slow->next;
            intersection = intersection->next;
        }

        // Now both pointers are at the starting node of the loop.
        Node* loopStart = slow;

        // ----------------------------------------------------
        // Step 3: Find the last node of the loop.
        // Traverse the cycle until a node points back
        // to the starting node.
        // ----------------------------------------------------
        Node* lastNode = loopStart;

        while (lastNode->next != loopStart) {
            lastNode = lastNode->next;
        }

        // Break the loop
        lastNode->next = NULL;
    }
};