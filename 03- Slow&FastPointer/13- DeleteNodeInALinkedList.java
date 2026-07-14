/*
# Delete Node in a Linked List (LC 237)

Pattern:
Linked List

Template:
// 1. Copy next node's value
node.val = node.next.val;

// 2. Skip the next node
node.next = node.next.next;

Key Idea:
- We are NOT given the head of the list.
- We cannot delete the current node directly.
- Copy the value of the next node into the current node.
- Then remove (skip) the next node.
- Works because the given node is guaranteed NOT to be the last node.

Example:
Input:
4 → 5 → 1 → 9
    ↑ (delete this node)

After copying & skipping:
4 → 1 → 9

No Head Given:
Input: node = 5
Output:
4 → 1 → 9

Complexity:
Time: O(1)
Space: O(1)
*/

Code:

class Solution {
    public void deleteNode(ListNode node) {

        // Copy next node value
        node.val = node.next.val;

        // Skip next node (delete it)
        node.next = node.next.next;
    }
}
